package com.supermap.dossiertool;

import com.supermap.dossiertool.bean.MyFile;
import com.supermap.dossiertool.mapper.*;

import com.supermap.dossiertool.pojo.*;
import com.supermap.dossiertool.service.serviceImpl.ReadAllFile;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.http.codec.json.Jackson2CodecSupport;
import org.springframework.stereotype.Service;
import org.springframework.test.context.junit4.SpringRunner;

import javax.activation.FileDataSource;
import javax.sql.DataSource;
import java.io.File;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DossiertoolApplicationTests {



	@Autowired
	DAS_AJJBXXMapper das_ajjbxxMapper;
	@Autowired
	DAS_BDCMapper das_bdcMapper;
	@Autowired
	DAS_CQMapper das_cqMapper;
	@Autowired
	DAS_JNWJMapper das_jnwjMapper;
	@Autowired
	DAS_JNWJ_FJMapper das_jnwj_fjMapper;
	@Autowired
	ReadAllFile readAllFile;

	@Test
	public void contextLoads() throws Exception {
		Date date = new Date();
		das_jnwj_fjMapper.insert(new DAS_JNWJ_FJ("test","test",1,"test",0,"test","test","test",0));
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

}

