package com.supermap.dossiertool.service;

import com.supermap.dossiertool.bean.MyFile;
import com.supermap.dossiertool.pojo.*;

import java.util.List;

/**
 * @Author: xiangXX
 * @Description:
 * @Date Created in 17:34 2018/12/26 0026
 */
public interface ZGStockSystemService {
    void insertData(DasAjjbxx das_ajjbxx, DasBdc das_bdc, DasCq das_cq, String folderPath) throws Exception;
    List<MyFile> getJpgList(String path, String AJH);
}
