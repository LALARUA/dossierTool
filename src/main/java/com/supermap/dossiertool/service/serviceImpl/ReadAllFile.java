package com.supermap.dossiertool.service.serviceImpl;

import com.supermap.dossiertool.bean.MyFile;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileInputStream;

/**
 * @Author: xiangXX
 * @Description:
 * @Date Created in 22:16 2018/12/20 0020
 */
@Service
public class ReadAllFile {
    public MyFile readAllFile(File file) throws Exception{

        MyFile myFile = new MyFile(file.getName());
        com.supermap.dossiertool.function.ReadAllFile readAllFile = new com.supermap.dossiertool.function.ReadAllFile();
        return readAllFile.readAllFile(file,myFile);
    }

}
