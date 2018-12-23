package com.supermap.dossiertool.controller;

import com.supermap.dossiertool.bean.MyFile;
import com.supermap.dossiertool.function.MyFunction;
import com.supermap.dossiertool.pojo.DAS_AJJBXX;
import net.sf.json.JSONArray;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: xiangXX
 * @Description:
 * @Date Created in 10:26 2018/12/22 0022
 */
@Controller
public class submitForm {

    @GetMapping("/submit")
    public String submit(HttpServletRequest httpServletRequest){
        MyFile myFile = MyFunction.readAllFile(new File("E:\\zigongDATA\\自贡数据\\沿滩镇升坪街"));
        httpServletRequest.setAttribute("data", JSONArray.fromObject(myFile).toString());
        System.out.println(httpServletRequest.getAttribute("data"));
        return "test222";
    }

    @ResponseBody
    @GetMapping("/getJpgList")
    public List getJpgList(String path){
       return MyFunction.getJpgList(path);


    }
}
