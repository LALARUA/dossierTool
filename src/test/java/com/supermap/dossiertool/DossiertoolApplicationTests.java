package com.supermap.dossiertool;

import com.supermap.dossiertool.mapper.TestMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DossiertoolApplicationTests {
	@Autowired
	TestMapper testMapper;

	@Test
	public void contextLoads() {
		com.supermap.dossiertool.pojo.Test byId = testMapper.findById(1);

	}

}

