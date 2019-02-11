package com.supermap.dossiertool.service;

import com.supermap.dossiertool.bean.*;
import com.supermap.dossiertool.pojo.*;
import com.supermap.dossiertool.smattrEntity.Jsydsyq;
import com.supermap.dossiertool.smattrEntity.Txm;
import com.supermap.dossiertool.smattrEntity.TxmWithBLOBs;
import com.supermap.dossiertool.smattrEntity.Zdjbxx;

import java.util.List;
import java.util.Map;

/**
 * @Author: xiangXX
 * @Description:
 * @Date Created in 17:34 2018/12/26 0026
 */
public interface ZGStockSystemService {
//    void insertData(DasAjjbxx das_ajjbxx, DasBdc das_bdc, DasCq das_cq, String folderPath) throws Exception;
    Map<String,Map> getSelect(List<String> selectsFromConstNameList,List<String> selectsFromOtherNameList);
    void submitData(Zdjbxx zdjbxx, TdpzytList tdpzytList, TxmList txmList);
    List<MyFile> getJpgList(String path, String AJH);
    PublicExcelData getPublicExcelData(String excelPath, String AJH) throws Exception;
    TxmWithBLOBs selectTxm(String dabh);
    List<Zdjbxx> selectZdxxs(SelectZdxx selectZdxx);
}
