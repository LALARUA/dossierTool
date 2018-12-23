package com.supermap.dossiertool.service.serviceImpl;

import com.supermap.dossiertool.bean.MyFile;
import com.supermap.dossiertool.function.MyFunction;
import org.springframework.stereotype.Service;

import java.io.File;

/**
 * @Author: xiangXX
 * @Description:
 * @Date Created in 22:16 2018/12/20 0020
 */
@Service
public class ReadAllFile {
    public MyFile readAllFile(File file) throws Exception{
        return MyFunction.readAllFile(file);
    }

}
