package com.supermap.dossiertool.function;

import com.supermap.dossiertool.bean.MyFile;
import com.supermap.dossiertool.bean.MyFolder;
import com.supermap.dossiertool.pojo.PublicExcelData;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
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
    /**
     * @description 根据AJH获取其在Excel表中的数据
     * @author xiangXX
     * @date 2018/12/22 0022 10:54
      * @param excelPath Excel表的地址
     *  @Param AJH       档案号
     */
    public static PublicExcelData getPublicExcelData(String excelPath,String AJH) throws Exception{
        excelPath = "E:\\zigongDATA\\自贡数据\\打印台账汇总.xls";
        File excel = new File(excelPath);
        FileInputStream fileInputStream = new FileInputStream(excel);
        Workbook wb = new HSSFWorkbook(fileInputStream);
        Sheet sheet = wb.getSheetAt(0);
        int lastRowNum = sheet.getLastRowNum();
        PublicExcelData publicDataFromExcel = null;
        for (int row = 1;row <= lastRowNum; row++) {
            Cell cell = sheet.getRow(row).getCell(0);
            String positionContent = cell.toString();
            int end = positionContent.indexOf(".");
            positionContent = positionContent.substring(0,end);  //去除最后的 .0 字符串
            if (AJH.equals(positionContent)){
                publicDataFromExcel = new PublicExcelData();
                Row rowFromAJH = sheet.getRow(row);
                publicDataFromExcel.setQLR(rowFromAJH.getCell(1).toString());
                publicDataFromExcel.setTDZH(rowFromAJH.getCell(2).toString());
                publicDataFromExcel.setFWZL(rowFromAJH.getCell(3).toString());
                break;
            }
        }
		return publicDataFromExcel;
    }
}
