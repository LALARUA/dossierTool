package com.supermap.dossiertool.function;

import com.supermap.dossiertool.bean.MyFile;

import java.io.File;
import java.util.ArrayList;

/**
 * @Author: xiangXX
 * @Description:
 * @Date Created in 22:23 2018/12/20 0020
 */
public class ReadAllFile {
    public MyFile readAllFile(File file,MyFile myFile){

        if (file.isDirectory()){
            File[] files = file.listFiles();
            myFile.setFolder(true);
            myFile.setSonFile(new ArrayList<MyFile>());
            for (File f:files
                 ) {
                myFile.getSonFile().add(readAllFile(f,new MyFile(f.getName())));

                }
        }
        else myFile.setFolder(false);

        return myFile;

    }
}
