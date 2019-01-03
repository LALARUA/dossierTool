package com.supermap.dossiertool.service.serviceImpl;

import com.supermap.dossiertool.bean.*;
import com.supermap.dossiertool.function.MyFunction;
import com.supermap.dossiertool.pojo.*;
import com.supermap.dossiertool.service.ZGStockSystemService;
import com.supermap.dossiertool.smattrEntity.*;
import com.supermap.dossiertool.smattrMapper.*;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.File;
import java.io.FileInputStream;
import java.math.BigDecimal;
import java.util.*;

/**
 * @Author: xiangXX
 * @Description:
 * @Date Created in 10:57 2018/12/22 0022
 */
@Service
public class ZGStockSystemServiceImpl implements ZGStockSystemService{
    @Autowired
    JsydsyqMapper jsydsyqMapper;
    @Autowired
    QlrMapper qlrMapper;
    @Autowired
    TdpzytMapper tdpzytMapper;
    @Autowired
    TxmMapper txmMapper;
    @Autowired
    ZdjbxxMapper zdjbxxMapper;

    @Autowired
    ConstMapper constMapper;
    @Autowired
    OtherMapper otherMapper;
    /**
     * @description
     * @author xiangXX
     * @date 2018/12/22 0022 15:49
      * @param folderPath 需要读取图片所在的文件夹路径
     *
     */
    @Transactional
    public void insertData(DasAjjbxx das_ajjbxx, DasBdc das_bdc,DasCq das_cq,String folderPath) throws Exception{
        String AJH = folderPath.substring(folderPath.lastIndexOf("\\")+1);  //档案号
        PublicExcelData publicExcelData = MyFunction.getPublicExcelData("E:\\zigongDATA\\自贡数据\\打印台账汇总.xls", AJH);
        String QLR = publicExcelData.getQLR();    //权利人
        String TDZH = publicExcelData.getTDZH();  //土地证号
        String FWZL = publicExcelData.getFWZL();  //房屋坐落
        File file = new File(folderPath);
        List<File> files = new ArrayList<>(Arrays.asList(file.listFiles()));
        for (int i = files.size()-1; i >=0 ; i--) {            //去除文件夹中的Thumbs.db文件,否则下面的foreach每次都要equal判断。
            if ("Thumbs.db".equals(files.get(i).getName())){   //一般该文件在最后，所以从最后开始遍历（不排除不在最后的情况，所以不直接删除最后一个文件）
                files.remove(i);
                break;
            }
        }

        Map<String,List<File>> map = new LinkedHashMap<>();   //key为图片种类名称  value为该种类下的图片
        int WJYS = files.size();
        long WJJS = 0;  //图片种类数
        for (File jpg:files                         //遍历files放进map中
                ) {
            String fileName = jpg.getName();
            int leftIndex = fileName.indexOf("-");
            int rightIndex = fileName.lastIndexOf("-");
            String typeName = fileName.substring(leftIndex+1,rightIndex);
            if (map.containsKey(typeName))
                map.get(typeName).add(jpg);
            else{
                List<File> list = new ArrayList();
                list.add(jpg);
                map.put(typeName,list);
                WJJS++;
            }

        }
        //DAS_AJJBXX数据
        int leftBracketIndex = TDZH.indexOf("(");
        int rightBracketIndex = TDZH.indexOf(")");
        Long ND = Long.valueOf(TDZH.substring(leftBracketIndex+1,rightBracketIndex));
        String AJID = UUID.randomUUID().toString();
        das_ajjbxx.setAjid(AJID);
        das_ajjbxx.setNd(ND);
        das_ajjbxx.setQzh(TDZH);
        das_ajjbxx.setAjh(AJH);
        das_ajjbxx.setWjjs(WJJS);
        das_ajjbxx.setWjjs(WJJS);
        das_ajjbxx.setBcqx(0);
        das_ajjbxx.setScrq(new Date());
        das_ajjbxx.setYxbz(0);




        //DAS_BDC数据
        String BDCID = UUID.randomUUID().toString();
        das_bdc.setBdcid(BDCID);
        das_bdc.setAjid(AJID);
        das_bdc.setBdcqzh(TDZH);
        das_bdc.setZl(FWZL);
        das_bdc.setSyqr(QLR);
        das_bdc.setYwlx("DAS_CQ");
        das_bdc.setQzh(TDZH);



        //DAS_CQ数据
        String ID = UUID.randomUUID().toString();
        das_cq.setId(ID);
        das_cq.setAjid(AJID);
        das_cq.setSyqr(QLR);
        das_cq.setQzh(TDZH);
        das_cq.setZl(FWZL);



        //DAS_JNWJ数据
        int SXH = 0;       //顺序号
        List<DasJnwj> das_jnwjs = new ArrayList<>();
        List<DasJnwjFj> das_jnwj_fjs = new ArrayList<>();
        String PATH = folderPath.substring("E:\\zigongDATA\\".length()-1);
        for (Map.Entry<String,List<File>> entry:map.entrySet()
                ) {
            String TM = entry.getKey();
            String WJID = UUID.randomUUID().toString();
            List<File>  jpgs = entry.getValue();        //该种类下的图片
            int YS = jpgs.size();

//            das_jnwjs.add(new DAS_JNWJ(WJID,AJID,++SXH,TM,YS));
            DasJnwj dasJnwj = new DasJnwj();
            dasJnwj.setWjid(WJID);
            dasJnwj.setAjid(AJID);
            dasJnwj.setSxh(++SXH);
            dasJnwj.setTm(TM);
            dasJnwj.setYs(YS);

            das_jnwjs.add(dasJnwj);

            //DAS_JNWJ_FJ数据
//            int relativePathIndex = folderPath.indexOf("E:\\zigongDATA\\");

            int YH = 0;
            for (File jpg:jpgs
                    ) {
                String FJID = UUID.randomUUID().toString();
                String FJMC = jpg.getName();
                int postfixIndex = jpg.getName().lastIndexOf(".");
                String FILETYPE = jpg.getName().substring(postfixIndex);
//
                DasJnwjFj dasJnwjFj = new DasJnwjFj();
                dasJnwjFj.setFjid(FJID);
                dasJnwjFj.setWjid(WJID);
                dasJnwjFj.setYh(++YH);
                dasJnwjFj.setFjmc(FJMC);
                dasJnwjFj.setFjlx(0);
                dasJnwjFj.setPath(PATH);
                dasJnwjFj.setFiletype(FILETYPE);
                dasJnwjFj.setFjid(FJID);
                dasJnwjFj.setIsrk(0);

                das_jnwj_fjs.add(dasJnwjFj);

            }
        }
    }

    @Override
//    @Cacheable(key = "#selectNameList",cacheNames = "select")
    public Map<String,Map> getSelect(List<String> selectsFromConstNameList,List<String> selectsFromOtherNameList) {
        HashSet<String> strings = new HashSet<>(selectsFromConstNameList);
        Map<String,List<Const>> selectsFromConstMap = new HashMap<>();

        for (String s : strings) {
            selectsFromConstMap.put(s,constMapper.getSelected(s.toUpperCase()));
        }

        Map<String,List<Djqx>> selectsFromOtherMap = new HashMap<>();
        for (String s : selectsFromOtherNameList) {
            selectsFromOtherMap.put(s,otherMapper.djqxs(s));
        }

        Map<String,Map> map = new HashMap<>();
        map.put("selectsFromConst",selectsFromConstMap);
        map.put("selectsFromOther",selectsFromOtherMap);
        return map;
    }

    @Transactional
    @Override
    public void submitData(Zdjbxx zdjbxx, Jsydsyq jsydsyq, TdpzytList tdpzytList, QlrList qlrList, Txm txm) {
        //宗地基本信息
        zdjbxx.setObjectid(zdjbxxMapper.findMaxId());
        String zdjbxxBsm = UUID.randomUUID().toString();  //宗地基本信息标识码
        zdjbxx.setBsm(zdjbxxBsm);

        //使用权信息
        String syqBsm = UUID.randomUUID().toString();    //使用权标识码
        jsydsyq.setBsm(syqBsm);
        jsydsyq.setBdcdybsm(zdjbxxBsm);
        jsydsyq.setBdcdyh(zdjbxx.getBdcdyh());
        jsydsyq.setObjectid(jsydsyqMapper.findMaxId());


        //土地用途信息
        List<Tdpzyt> tdyts = tdpzytList.getTdpzyts();   //土地用途列表
        for (Tdpzyt t : tdyts) {
            t.setObjectid(tdpzytMapper.findMaxId());
            t.setBsm(UUID.randomUUID().toString());
            t.setZdbsm(zdjbxxBsm);
        }

        //权利人信息
        BigDecimal sxh = new BigDecimal(0);
        List<Qlr> qlrs = qlrList.getQlrs();       //权利人信息列表
        for (Qlr q : qlrs) {
            q.setBsm(UUID.randomUUID().toString());
            q.setQlbsm(syqBsm);
            q.setObjectid(qlrMapper.findMaxId());
            q.setSxh(sxh.add(new BigDecimal(1)));
            q.setBdcdyh(zdjbxx.getBdcdyh());
        }

        //档案信息
        txm.setZddm(zdjbxx.getZddm());
        txm.setTxmid(txmMapper.findMaxId());

    }


//    @Cacheable(cacheNames = "handlingAJH",key = "#AJH")
    public List<MyFile> getJpgList(String path,String AJH){
        return MyFunction.getJpgList(path);
    }

    @Override
    public PublicExcelData getPublicExcelData(String excelPath, String AJH) throws Exception {
        excelPath = "E:\\zigongDATA\\自贡数据\\打印台账汇总.xls";
        File excel = new File(excelPath);
        FileInputStream fileInputStream = new FileInputStream(excel);
        String postfix = excelPath.substring(excelPath.lastIndexOf("."));
        Workbook wb = null;
        if (".xls".equals(postfix))
            wb = new HSSFWorkbook(fileInputStream);
        else if (".xlsx".equals(postfix))
            wb = new XSSFWorkbook(fileInputStream);
        for (int i = 0; i < wb.getNumberOfSheets(); i++) {
            Sheet sheet = wb.getSheetAt(i);
            int lastRowNum = sheet.getLastRowNum();
            PublicExcelData publicDataFromExcel = null;
            for (int row = 1;row <= lastRowNum; row++) {
                Cell cell = sheet.getRow(row).getCell(0);
                String positionContent = cell.toString();
                int end = positionContent.indexOf(".");
                positionContent = positionContent.substring(0,end);  //去除最后的 .0 字符串
                if (AJH.equals(positionContent)){
                    publicDataFromExcel = new PublicExcelData();
                    Row rowFromAJH = sheet.getRow(row);
                    publicDataFromExcel.setDABH(AJH);
                    publicDataFromExcel.setQLR(rowFromAJH.getCell(1).toString());
                    publicDataFromExcel.setTDZH(rowFromAJH.getCell(2).toString());
                    publicDataFromExcel.setFWZL(rowFromAJH.getCell(3).toString());
                    publicDataFromExcel.setZDDM(rowFromAJH.getCell(4).toString());
                    String s = rowFromAJH.getCell(5).toString();
                    publicDataFromExcel.setFPYS(s.substring(0,s.indexOf(".")));
                    publicDataFromExcel.setBGQX(rowFromAJH.getCell(6).toString());
                    publicDataFromExcel.setDALXBH(rowFromAJH.getCell(7).toString());
                    publicDataFromExcel.setDALX(rowFromAJH.getCell(7).toString().substring(0,1));
                    return publicDataFromExcel;
                }
            }
        }

        return null;
    }

}
