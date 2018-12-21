package com.supermap.dossiertool;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "com.supermap.dossiertool.mapper")
@SpringBootApplication
public class DossiertoolApplication {

	public static void main(String[] args) {
		SpringApplication.run(DossiertoolApplication.class, args);
	}

}

