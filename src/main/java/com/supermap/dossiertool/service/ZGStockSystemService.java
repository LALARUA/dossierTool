package com.supermap.dossiertool.service;

import com.supermap.dossiertool.bean.MyFile;

import java.util.List;

/**
 * @Author: xiangXX
 * @Description:
 * @Date Created in 17:34 2018/12/26 0026
 */
public interface ZGStockSystemService {
    void insertData(String folderPath) throws Exception;
    List<MyFile> getJpgList(String path, String AJH);
}
