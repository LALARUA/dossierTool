package com.supermap.dossiertool;

import com.supermap.dossiertool.bean.Djqx;
import com.supermap.dossiertool.function.MyFunction;


import com.supermap.dossiertool.pojo.*;
import com.supermap.dossiertool.service.ZGStockSystemService;
import com.supermap.dossiertool.service.serviceImpl.ZGStockSystemServiceImpl;
import com.supermap.dossiertool.smattrMapper.ConstMapper;
import com.supermap.dossiertool.smattrMapper.JsydsyqMapper;
import com.supermap.dossiertool.smattrMapper.OtherMapper;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.io.FileInputStream;
import java.util.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DossiertoolApplicationTests {


	@Autowired
	ZGStockSystemServiceImpl handleData;


	@Autowired
	ZGStockSystemService zgStockSystemService;
	@Autowired
	JsydsyqMapper jsydsyqMapper;

	@Autowired
	ConstMapper constMapper;

	@Autowired
	OtherMapper otherMapper;

	@Test
	public void contextLoads() throws Exception {

		List<Djqx> xzq = otherMapper.djqxs("xzq");
		System.out.println();


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
		String AJH = "5000051";
		PublicExcelData publicExcelData = MyFunction.getPublicExcelData("E:\\zigongDATA\\自贡数据\\打印台账汇总.xls", AJH);
		String QLR = publicExcelData.getQLR();    //权利人
		String TDZH = publicExcelData.getTDZH();  //土地证号
		String FWZL = publicExcelData.getFWZL();  //房屋坐落
		File file = new File("E:\\zigongDATA\\自贡数据\\沿滩镇升坪街\\0010\\5000051");
		List<File> files = new ArrayList<>(Arrays.asList(file.listFiles()));
		for (int i = files.size()-1; i >=0 ; i--) {            //去除文件夹中的Thumbs.db文件,否则下面的foreach每次都要equal判断。
			if ("Thumbs.db".equals(files.get(i).getName())){   //一般该文件在最后，所以从最后开始遍历（不排除不在最后的情况，所以不直接删除最后一个文件）
				files.remove(i);
				break;
			}
		}

		Map<String,List<File>> map = new LinkedHashMap<>();   //key为图片种类名称  value为该种类下的图片
		int WJYS = files.size();
		int WJJS = 0;  //图片种类数
		for (File jpg:files                         //遍历files放进map中
			 ) {
			String fileName = jpg.getName();
			int leftIndex = fileName.indexOf("-");
			int rightIndex = fileName.lastIndexOf("-");
			String typeName = fileName.substring(leftIndex+1,rightIndex);
			if (map.containsKey(typeName))
				map.get(typeName).add(jpg);
			else{
				List<File> list = new ArrayList();
				list.add(jpg);
				map.put(typeName,list);
				WJJS++;
			}

		}
		//DAS_AJJBXX数据
		int leftBracketIndex = TDZH.indexOf("(");
		int rightBracketIndex = TDZH.indexOf(")");
		int ND = Integer.valueOf(TDZH.substring(leftBracketIndex+1,rightBracketIndex));
		String AJID = UUID.randomUUID().toString();
		DAS_AJJBXX das_ajjbxx = new DAS_AJJBXX(AJID, ND, TDZH, AJH, WJJS, WJYS, 0, new Date(), 0);
		System.out.println(das_ajjbxx);


		//DAS_BDC数据
		String BDCID = UUID.randomUUID().toString();
		DAS_BDC das_bdc = new DAS_BDC(BDCID, AJID, TDZH, FWZL, QLR, "DAS_CQ", TDZH);

		//DAS_CQ数据
		String ID = UUID.randomUUID().toString();
		DAS_CQ das_cq = new DAS_CQ(ID, AJID, QLR, TDZH, FWZL);

		//DAS_JNWJ数据
		int SXH = 0;       //顺序号
		List<DAS_JNWJ> das_jnwjs = new ArrayList<>();
		List<DAS_JNWJ_FJ> das_jnwj_fjs = new ArrayList<>();
		for (Map.Entry<String,List<File>> entry:map.entrySet()
			 ) {
			String TM = entry.getKey();
			String WJID = UUID.randomUUID().toString();
			List<File>  jpgs = entry.getValue();        //该种类下的图片
			int YS = jpgs.size();
			das_jnwjs.add(new DAS_JNWJ(WJID,AJID,++SXH,TM,YS));
			//DAS_JNWJ_FJ数据
			int relativePathIndex = file.getPath().indexOf("E:\\zigongDATA\\");
			String PATH = file.getPath().substring(relativePathIndex);
			int YH = 0;
			for (File jpg:jpgs
				 ) {
				String FJID = UUID.randomUUID().toString();
				String FJMC = jpg.getName();
				int postfixIndex = jpg.getName().lastIndexOf(".");
				String FILETYPE = jpg.getName().substring(postfixIndex);
				das_jnwj_fjs.add(new DAS_JNWJ_FJ(FJID,WJID,++YH,FJMC,0,PATH,FILETYPE,FJID,0));
			}
		}
		System.out.println();
	}
	@Test
	public void readExcel() throws Exception{
		String AJH = "5000021";
		String excelPath = "E:\\zigongDATA\\自贡数据\\打印台账汇总.xls";
		File excel = new File(excelPath);
		FileInputStream fileInputStream = new FileInputStream(excel);
		Workbook wb = new HSSFWorkbook(fileInputStream);
		Sheet sheet = wb.getSheetAt(0);
		int lastRowNum = sheet.getLastRowNum();
		PublicExcelData publicDataFromExcel = new PublicExcelData();
		for (int row = 1;row <= lastRowNum; row++) {
			Cell cell = sheet.getRow(row).getCell(0);
			String positionContent = cell.toString();
			int end = positionContent.indexOf(".");
			positionContent = positionContent.substring(0,end);  //去除最后的 .0 字符串
			if (AJH.equals(positionContent)){
				Row rowFromAJH = sheet.getRow(row);
				publicDataFromExcel.setQLR(rowFromAJH.getCell(1).toString());
				publicDataFromExcel.setTDZH(rowFromAJH.getCell(2).toString());
				publicDataFromExcel.setFWZL(rowFromAJH.getCell(3).toString());
				break;
			}
		}
	}

	@Test
	public void getPublicExcelData() throws Exception{
		String excelPath = "C:\\Users\\Administrator\\Desktop\\自贡需求12.19\\附件：自贡档案字段采集表12.19.xls";
		File excel = new File(excelPath);
		FileInputStream fileInputStream = new FileInputStream(excel);
		Workbook wb = new HSSFWorkbook(fileInputStream);
		Sheet sheet = wb.getSheetAt(1);
		int lastRowNum = sheet.getLastRowNum();

		StringBuilder s = new StringBuilder();
		for (int row = 4;row <= lastRowNum; row++) {

//			int end = positionContent.indexOf(".");
//			positionContent = positionContent.substring(0,end);  //去除最后的 .0 字符串

			if (row%2==0)
				s.append("<div class=\"from-row zdxx\">\n");
			String zs = sheet.getRow(row).getCell(1).toString();
			String mc = sheet.getRow(row).getCell(2).toString();
			s.append("<div class=\"zdxx form-group col-md-6\">\n");
			s.append("<label for=\""+mc.toLowerCase()+"\">"+zs+"</label>\n");
			s.append("<input type=\"text\" class=\"form-control\" name=\""+mc.toLowerCase()+"\" id=\""+mc.toLowerCase()+"\" placeholder=\""+zs+"\">\n </div>\n");
			if (row%2!=0)
				s.append(" </div>\n");
		}


		System.out.println(s);
	}



}


