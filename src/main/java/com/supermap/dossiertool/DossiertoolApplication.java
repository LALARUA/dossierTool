package com.supermap.dossiertool;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@MapperScan(basePackages = "com.supermap.dossiertool.myMapper")
@EnableCaching
@SpringBootApplication
public class DossiertoolApplication {

	public static void main(String[] args) {
		SpringApplication.run(DossiertoolApplication.class, args);
	}

}

