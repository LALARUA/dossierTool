package com.supermap.dossiertool.function;

import com.supermap.dossiertool.bean.MyFile;
import com.supermap.dossiertool.pojo.PublicExcelData;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;

/**
 * @Author: xiangXX
 * @Description:
 * @Date Created in 22:23 2018/12/20 0020
 */
public class MyFunction {
    public static MyFile readAllFile(File file,MyFile myFile){
        if (file.isDirectory()){
            File[] files = file.listFiles();
            myFile.setFolder(true);
            myFile.setNodes(new ArrayList<MyFile>());
            for (File f:files
                 ) {
                myFile.getNodes().add(readAllFile(f,new MyFile(f.getName())));

                }
        }
        else myFile.setFolder(false);
        return myFile;
    }
    /**
     * @description 根据AJH获取其在Excel表中的数据
     * @author xiangXX
     * @date 2018/12/22 0022 10:54
      * @param ExcelPath Excel表的地址
     *  @Param AJH       档案号
     */
    public static PublicExcelData getPublicExcelData(String ExcelPath,String AJH) throws Exception{
        String excelPath = "E:\\zigongDATA\\自贡数据\\打印台账汇总.xls";
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
