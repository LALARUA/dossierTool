package com.supermap.dossiertool.controller;

import com.supermap.dossiertool.bean.MyFile;
import com.supermap.dossiertool.function.MyFunction;
import com.supermap.dossiertool.pojo.DAS_AJJBXX;
import net.sf.json.JSONArray;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import java.io.File;

/**
 * @Author: xiangXX
 * @Description:
 * @Date Created in 10:26 2018/12/22 0022
 */
@Controller
public class submitForm {

    @GetMapping("/submit")
    public String submit(HttpServletRequest httpServletRequest){
        MyFile myFile = MyFunction.readAllFile(new File("C:\\Users\\Administrator\\Desktop\\copyFile"), new MyFile("copyFile"));
        httpServletRequest.setAttribute("data", JSONArray.fromObject(myFile).toString());
        System.out.println(httpServletRequest.getAttribute("data"));
        return "test222";
    }
}
