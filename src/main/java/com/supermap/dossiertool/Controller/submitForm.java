package com.supermap.dossiertool.Controller;

import com.supermap.dossiertool.pojo.DAS_AJJBXX;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: xiangXX
 * @Description:
 * @Date Created in 10:26 2018/12/22 0022
 */
@RestController
public class submitForm {

    @GetMapping("/submit")
    public String submit(DAS_AJJBXX das_ajjbxx){

        return "hello world";
    }
}
