package com.supermap.dossiertool.service;

import com.supermap.dossiertool.bean.MyFile;
import com.supermap.dossiertool.pojo.DAS_AJJBXX;
import com.supermap.dossiertool.pojo.DAS_BDC;
import com.supermap.dossiertool.pojo.DAS_CQ;

import java.util.List;

/**
 * @Author: xiangXX
 * @Description:
 * @Date Created in 17:34 2018/12/26 0026
 */
public interface ZGStockSystemService {
    void insertData(DAS_AJJBXX das_ajjbxx, DAS_BDC das_bdc, DAS_CQ das_cq,String folderPath) throws Exception;
    List<MyFile> getJpgList(String path, String AJH);
}
