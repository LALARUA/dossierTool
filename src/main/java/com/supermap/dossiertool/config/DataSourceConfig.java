package com.supermap.dossiertool.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * @Author: xiangXX
 * @Description:
 * @Date Created in 17:19 2018/12/20 0020
 */
@Configuration
public class DataSourceConfig {


//    @Bean(name = "dossierDatasource")
//    @ConfigurationProperties("spring.datasource.dossier")
//    public DataSource dossierDatasource(){
//        return DataSourceBuilder.create().build();
//    }
}
