package com.supermap.dossiertool.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
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
 * @Date Created in 20:02 2018/12/20 0020
 */
@Configuration
@MapperScan(basePackages = "com.supermap.dossiertool.mapper.dossierMapper",sqlSessionTemplateRef = "dossierSqlSessionTemplate")
public class DossierDatasourceConfig {

    @Bean(name = "dossierDatasource")
    @Primary
    @ConfigurationProperties(prefix = "spring.datasource.dossier")
    public DataSource dossierDatasource(){
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "dossierSqlSessionFactory")
    @Primary
    public SqlSessionFactory dossierSqlSessionFactory(@Qualifier("dossierDatasource") DataSource datasource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(datasource);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath*:mapping/test01/*.xml"));
        return bean.getObject();
    }
    @Bean("dossierSqlSessionTemplate")
    @Primary
    public SqlSessionTemplate dossierSqlSessionTemplate(@Qualifier("dossierSqlSessionFactory") SqlSessionFactory sessionFactory) {
        return new SqlSessionTemplate(sessionFactory);
    }
}
