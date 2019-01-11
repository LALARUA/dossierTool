package com.supermap.dossiertool;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;

@MapperScan(basePackages = "com.supermap.dossiertool.smattrMapper")
@EnableCaching
@SpringBootApplication
public class DossiertoolApplication
//				extends SpringBootServletInitializer
{
//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//		return builder.sources(DossiertoolApplication.class);
//	}

	public static void main(String[] args) {
		SpringApplication.run(DossiertoolApplication.class, args);
	}

}

