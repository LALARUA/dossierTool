package com.supermap.dossiertool.controller;

import com.supermap.dossiertool.bean.MyFile;
import com.supermap.dossiertool.function.MyFunction;
import com.supermap.dossiertool.pojo.DAS_AJJBXX;
import com.supermap.dossiertool.service.serviceImpl.ZGStockSystemServiceImpl;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.*;

/**
 * @Author: xiangXX
 * @Description:
 * @Date Created in 10:26 2018/12/22 0022
 */
@Controller
public class submitForm {
    @Autowired
    CacheManager cacheManager;

    @Autowired
    ZGStockSystemServiceImpl handleDataService;

    @GetMapping("/index")
    public String submit(HttpServletRequest httpServletRequest,@RequestParam(required = false,defaultValue = "E:\\zigongDATA\\自贡数据\\沿滩镇升坪街") String path){
        MyFile myFile = MyFunction.readAllFile(new File(path));
        httpServletRequest.setAttribute("data", JSONArray.fromObject(myFile).toString());
        return "index";
    }

    @ResponseBody
    @GetMapping("/getJpgList")
    public Map getJpgList(String path,String AJH,@RequestParam(required = false,defaultValue = "E:\\zigongDATA\\自贡数据\\打印台账汇总.xls") String excelPath){
        Map map = new HashMap<>();
        try {
            map.put("excelData",MyFunction.getPublicExcelData(excelPath,AJH));
            map.put("jpgs",MyFunction.getJpgList(path));
        } catch (Exception e) {
            e.printStackTrace();
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

    @ResponseBody
    @PostMapping("/submitData")
    public String submitData(DAS_AJJBXX das_ajjbxx){

        return "success";
    }
}
