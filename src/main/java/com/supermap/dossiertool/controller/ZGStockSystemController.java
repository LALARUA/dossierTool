package com.supermap.dossiertool.controller;

import com.supermap.dossiertool.bean.MyFile;
import com.supermap.dossiertool.config.MyPropertiesConfig;
import com.supermap.dossiertool.function.MyFunction;
import com.supermap.dossiertool.pojo.*;
import com.supermap.dossiertool.service.serviceImpl.ZGStockSystemServiceImpl;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.constraints.NotNull;
import java.io.File;
import java.util.*;

/**
 * @Author: xiangXX
 * @Description:
 * @Date Created in 10:26 2018/12/22 0022
 */
@EnableConfigurationProperties(MyPropertiesConfig.class)
@Controller
public class ZGStockSystemController {
    @Autowired
    CacheManager cacheManager;

    @Autowired
    ZGStockSystemServiceImpl zgStockSystemService;

    @Autowired
    MyPropertiesConfig myPropertiesConfig;


    /**
     * @description 进入首页
     * @author xiangXX
     * @date 2018/12/27 0027 11:37
      * @param
     * 
     */  
    @GetMapping("/index")
    public String submit(HttpServletRequest httpServletRequest/*@RequestParam(required = false,defaultValue = "E:\\zigongDATA\\自贡数据\\沿滩镇升坪街") String path*/){
        MyFile myFile = MyFunction.readAllFile(new File(myPropertiesConfig.getFolderPath()));
        httpServletRequest.setAttribute("data", JSONArray.fromObject(myFile).toString());
        return "index";
    }

    /**
     * @description 根据path获取该文件夹下所有图片
     * @author xiangXX
     * @date 2018/12/27 0027 11:36
      * @param
     * 
     */  
    @ResponseBody
    @GetMapping("/getJpgList")
    public Map getJpgList(String path,String AJH/*@RequestParam(required = false,defaultValue = "E:\\zigongDATA\\自贡数据\\打印台账汇总.xls") String excelPath*/){
        Map map = new HashMap<>();
        try {
            PublicExcelData publicExcelData = MyFunction.getPublicExcelData(myPropertiesConfig.getExcelPath(), AJH);
            if (publicExcelData==null){
                map.put("error","未查找到该案卷号台账信息");
                return map;
            }
            map.put("excelData",publicExcelData);
            map.put("jpgs",MyFunction.getJpgList(path));
        } catch (Exception e) {
                map.put("error","操作失败");
        }
        return map;
    }

    @ResponseBody
    @PostMapping("/deleteAJHInCache")
    public String deleteAJHInCache(String AJH){
        Cache handlingAJH = cacheManager.getCache("handlingAJH");
        handlingAJH.evict(AJH);
        return "";
    }

    /**
     * @description 提交表单
     * @author xiangXX
     * @date 2018/12/27 0027 11:36
      * @param  
     * 
     */  
    @ResponseBody
    @PostMapping("/submitData")
    public String submitData(DasAjjbxx das_ajjbxx, DasBdc das_bdc, DasCq das_cq, String path){
        try {
            zgStockSystemService.insertData(das_ajjbxx,das_bdc,das_cq,path);
        } catch (Exception e) {
            e.printStackTrace();
            return "操作失败";
        }
        return "success";
    }
}
