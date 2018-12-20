package com.supermap.dossiertool;

import com.supermap.dossiertool.bean.MyFile;
import com.supermap.dossiertool.mapper.dossierMapper.DossierTestMapper;
import com.supermap.dossiertool.mapper.fileMapper.FileTestMapper;
import com.supermap.dossiertool.pojo.DossierTest;
import com.supermap.dossiertool.pojo.FileTest;
import com.supermap.dossiertool.service.serviceImpl.ReadAllFile;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;
import org.springframework.test.context.junit4.SpringRunner;

import javax.activation.FileDataSource;
import javax.sql.DataSource;
import java.io.File;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DossiertoolApplicationTests {
	@Autowired
	DossierTestMapper dossierTestMapper;

	@Autowired
	FileTestMapper fileTestMapper;

	@Autowired
	@Qualifier("fileDatasource")
	DataSource fileDataSource;

	@Autowired
	ReadAllFile readAllFile;

	@Test
	public void contextLoads() throws Exception {
		MyFile myFile = readAllFile.readAllFile(new File("C:\\Users\\Administrator\\Desktop\\copyFile"));
		System.out.println("ff");


//		System.out.println(fileDataSource.getClass());
//		DossierTest byId = dossierTestMapper.findById(1);
//		FileTest byId1 = fileTestMapper.findById(1);
//		System.out.println(byId);
//		System.out.println(byId1);
	}

}

