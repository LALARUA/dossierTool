package com.supermap.dossiertool;

import com.supermap.dossiertool.bean.Djqx;
import com.supermap.dossiertool.bean.PublicExcelData;
import com.supermap.dossiertool.function.MyFunction;


import com.supermap.dossiertool.pojo.*;
import com.supermap.dossiertool.service.ZGStockSystemService;
import com.supermap.dossiertool.service.serviceImpl.ZGStockSystemServiceImpl;
import com.supermap.dossiertool.smattrEntity.Qlr;
import com.supermap.dossiertool.smattrEntity.Tdpzyt;
import com.supermap.dossiertool.smattrEntity.Zdjbxx;
import com.supermap.dossiertool.smattrMapper.*;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.io.File;
import java.io.FileInputStream;
import java.math.BigDecimal;
import java.util.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DossiertoolApplicationTests {

	@Autowired
	DataSource dataSource;





	@Test
	public void contextLoads() throws Exception {


//		handleData.insertData("E:\\zigongDATA\\自贡数据\\沿滩镇升坪街\\0010\\5000051");
//		Date date = new Date();
//		das_jnwj_fjMapper.insert(new DAS_JNWJ_FJ("test","test",1,"test",0,"test","test","test",0));
//		das_jnwjMapper.insert(new DAS_JNWJ("test","test",1,"test",1));
//		das_cqMapper.insert(new DAS_CQ("test","test","test","qzh","test"));
//		das_bdcMapper.insert(new DAS_BDC("test","test","test","test","test","test","test"));
//		das_ajjbxxMapper.insert(new DAS_AJJBXX("test",2015,"test","test",12,42,0,date,0));

//		MyFile myFile = readAllFile.readAllFile(new File("C:\\Users\\Administrator\\Desktop\\copyFile"));
//		JSONObject jsonObject = JSONObject.fromObject(myFile);
//		System.out.println(jsonObject);



//		System.out.println(fileDataSource.getClass());
//		DossierTest byId = dossierTestMapper.findById(1);
//		FileTest byId1 = fileTestMapper.findById(1);
//		System.out.println(byId);
//		System.out.println(byId1);
	}



	@Test
	public void insertData() throws Exception{


	}

	@Test
	public void getPublicExcelData() throws Exception{
//		String excelPath = "C:\\Users\\Administrator\\Desktop\\自贡需求12.19\\附件：自贡档案字段采集表12.19.xls";
//		File excel = new File(excelPath);
//		FileInputStream fileInputStream = new FileInputStream(excel);
//		Workbook wb = new HSSFWorkbook(fileInputStream);
//		Sheet sheet = wb.getSheetAt(1);
//		int lastRowNum = sheet.getLastRowNum();
//
//		StringBuilder s = new StringBuilder();
//		for (int row = 4;row <= lastRowNum; row++) {
//
////			int end = positionContent.indexOf(".");
////			positionContent = positionContent.substring(0,end);  //去除最后的 .0 字符串
//
//			if (row%2==0)
//				s.append("<div class=\"from-row zdxx\">\n");
//			String zs = sheet.getRow(row).getCell(1).toString();
//			String mc = sheet.getRow(row).getCell(2).toString();
//			s.append("<div class=\"zdxx form-group col-md-6\">\n");
//			s.append("<label for=\""+mc.toLowerCase()+"\">"+zs+"</label>\n");
//			s.append("<input type=\"text\" class=\"form-control\" name=\""+mc.toLowerCase()+"\" id=\""+mc.toLowerCase()+"\" placeholder=\""+zs+"\">\n </div>\n");
//			if (row%2!=0)
//				s.append(" </div>\n");
//		}
//
//
//		System.out.println(s);
	}



}


