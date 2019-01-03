package com.supermap.dossiertool.function;

import com.supermap.dossiertool.bean.MyFile;
import com.supermap.dossiertool.bean.MyFolder;
import com.supermap.dossiertool.bean.PublicExcelData;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: xiangXX
 * @Description:
 * @Date Created in 22:23 2018/12/20 0020
 */
public class MyFunction {

    /**
     * @description
     * @author xiangXX
     * @date 2018/12/22 0022 20:47
      * @param file 要读取的文件夹
     *
     */
    public static MyFile readAllFile(File file){
        if (file.isDirectory()){
            File[] files = file.listFiles();
            if (files.length==0)
                return new MyFile(file.getName(),file.getPath());
            MyFolder myFolder = new MyFolder(file.getName(),file.getPath());
            for (File f:files
                 ) {
                MyFile currentFile = readAllFile(f);
                if (currentFile!=null)
                myFolder.getNodes().add(currentFile);
                }
                if (myFolder.getNodes().size()==0)
                    return new MyFile(file.getName(),file.getPath());
                return myFolder;
        }
        else return null;
    }

    /**
     * @description 获取该文件夹下所有图片
     * @author xiangXX
     * @date 2018/12/23 0023 22:52
      * @param path 文件夹地址
     *
     */
    public static List<MyFile> getJpgList(String path){
        File file = new File(path);
        File[] files = file.listFiles();
        List<MyFile> jpgs = new ArrayList<>(files.length);
        for (File f:files
             ) {
                jpgs.add(new MyFile(f.getName(),f.getPath()));
        }
        for (int i = jpgs.size()-1; i >=0 ; i--) {            //去除文件夹中的Thumbs.db文件
            if ("Thumbs.db".equals(jpgs.get(i).getText())){   //一般该文件在最后，所以从最后开始遍历（不排除不在最后的情况，所以不直接删除最后一个文件）
                jpgs.remove(i);
                break;
            }
        }
        return jpgs;
    }

}
