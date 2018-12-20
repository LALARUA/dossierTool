package com.supermap.dossiertool.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

/**
 * @Author: xiangXX
 * @Description:
 * @Date Created in 17:37 2018/12/20 0020
 */
@Configuration
public class FileDatasourceConfig {
    @Bean(name = "fileDatasource")
    @Primary
    @ConfigurationProperties(prefix = "spring.datasource.file")
    public DataSource fileDatasource(){
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "fileSqlSessionFactory")
    @Primary
    public SqlSessionFactory fileSqlSessionFactory(@Qualifier("fileDatasource") DataSource datasource)
            throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(datasource);
        bean.setMapperLocations(
                // 设置mybatis的xml所在位置
                new PathMatchingResourcePatternResolver().getResources("classpath*:mapping/test01/*.xml"));
        return bean.getObject();
    }
    @Bean("fileSqlSessionTemplate")
    @Primary
    public SqlSessionTemplate fileSqlSessionTemplate(@Qualifier("fileSqlSessionFactory") SqlSessionFactory sessionfactory) {
        return new SqlSessionTemplate(sessionfactory);
    }

}
