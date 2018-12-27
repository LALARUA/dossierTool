package com.supermap.dossiertool.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Author: xiangXX
 * @Description:  配置类
 * @Date Created in 11:17 2018/12/27 0027
 */
@ConfigurationProperties(prefix = "supermap")
public class MyPropertiesConfig {
    private String excelPath;
    private String folderPath;

    public String getExcelPath() {
        return excelPath;
    }

    public void setExcelPath(String excelPath) {
        this.excelPath = excelPath;
    }

    public String getFolderPath() {
        return folderPath;
    }

    public void setFolderPath(String folderPath) {
        this.folderPath = folderPath;
    }
}
