package com.supermap.dossiertool.service.serviceImpl;

import com.supermap.dossiertool.bean.*;
import com.supermap.dossiertool.controller.ZGStockSystemController;
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
import org.slf4j.LoggerFactory;
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

    private static   org.slf4j.Logger logger = LoggerFactory.getLogger(ZGStockSystemServiceImpl.class);
    /**
     * @description
     * @author xiangXX
     * @date 2018/12/22 0022 15:49
      * @param folderPath 需要读取图片所在的文件夹路径
     *
     */
//    @Transactional
//    public void insertData(DasAjjbxx das_ajjbxx, DasBdc das_bdc,DasCq das_cq,String folderPath) throws Exception{
//        String AJH = folderPath.substring(folderPath.lastIndexOf("\\")+1);  //档案号
//        PublicExcelData publicExcelData = MyFunction.getPublicExcelData("E:\\zigongDATA\\自贡数据\\打印台账汇总.xls", AJH);
//        List QLR = publicExcelData.getQLR();    //权利人
//        List TDZH = publicExcelData.getTDZH();  //土地证号
//        String FWZL = publicExcelData.getFWZL();  //房屋坐落
//        File file = new File(folderPath);
//        List<File> files = new ArrayList<>(Arrays.asList(file.listFiles()));
//        for (int i = files.size()-1; i >=0 ; i--) {            //去除文件夹中的Thumbs.db文件,否则下面的foreach每次都要equal判断。
//            if ("Thumbs.db".equals(files.get(i).getName())){   //一般该文件在最后，所以从最后开始遍历（不排除不在最后的情况，所以不直接删除最后一个文件）
//                files.remove(i);
//                break;
//            }
//        }
//
//        Map<String,List<File>> map = new LinkedHashMap<>();   //key为图片种类名称  value为该种类下的图片
//        int WJYS = files.size();
//        long WJJS = 0;  //图片种类数
//        for (File jpg:files                         //遍历files放进map中
//                ) {
//            String fileName = jpg.getName();
//            int leftIndex = fileName.indexOf("-");
//            int rightIndex = fileName.lastIndexOf("-");
//            String typeName = fileName.substring(leftIndex+1,rightIndex);
//            if (map.containsKey(typeName))
//                map.get(typeName).add(jpg);
//            else{
//                List<File> list = new ArrayList();
//                list.add(jpg);
//                map.put(typeName,list);
//                WJJS++;
//            }
//
//        }
//        //DAS_AJJBXX数据
//        int leftBracketIndex = TDZH.indexOf("(");
//        int rightBracketIndex = TDZH.indexOf(")");
//        Long ND = Long.valueOf(TDZH.substring(leftBracketIndex+1,rightBracketIndex));
//        String AJID = UUID.randomUUID().toString();
//        das_ajjbxx.setAjid(AJID);
//        das_ajjbxx.setNd(ND);
//        das_ajjbxx.setQzh(TDZH);
//        das_ajjbxx.setAjh(AJH);
//        das_ajjbxx.setWjjs(WJJS);
//        das_ajjbxx.setWjjs(WJJS);
//        das_ajjbxx.setBcqx(0);
//        das_ajjbxx.setScrq(new Date());
//        das_ajjbxx.setYxbz(0);
//
//
//
//
//        //DAS_BDC数据
//        String BDCID = UUID.randomUUID().toString();
//        das_bdc.setBdcid(BDCID);
//        das_bdc.setAjid(AJID);
//        das_bdc.setBdcqzh(TDZH);
//        das_bdc.setZl(FWZL);
//        das_bdc.setSyqr(QLR);
//        das_bdc.setYwlx("DAS_CQ");
//        das_bdc.setQzh(TDZH);
//
//
//
//        //DAS_CQ数据
//        String ID = UUID.randomUUID().toString();
//        das_cq.setId(ID);
//        das_cq.setAjid(AJID);
//        das_cq.setSyqr(QLR);
//        das_cq.setQzh(TDZH);
//        das_cq.setZl(FWZL);
//
//
//
//        //DAS_JNWJ数据
//        int SXH = 0;       //顺序号
//        List<DasJnwj> das_jnwjs = new ArrayList<>();
//        List<DasJnwjFj> das_jnwj_fjs = new ArrayList<>();
//        String PATH = folderPath.substring("E:\\zigongDATA\\".length()-1);
//        for (Map.Entry<String,List<File>> entry:map.entrySet()
//                ) {
//            String TM = entry.getKey();
//            String WJID = UUID.randomUUID().toString();
//            List<File>  jpgs = entry.getValue();        //该种类下的图片
//            int YS = jpgs.size();
//
////            das_jnwjs.add(new DAS_JNWJ(WJID,AJID,++SXH,TM,YS));
//            DasJnwj dasJnwj = new DasJnwj();
//            dasJnwj.setWjid(WJID);
//            dasJnwj.setAjid(AJID);
//            dasJnwj.setSxh(++SXH);
//            dasJnwj.setTm(TM);
//            dasJnwj.setYs(YS);
//
//            das_jnwjs.add(dasJnwj);
//
//            //DAS_JNWJ_FJ数据
////            int relativePathIndex = folderPath.indexOf("E:\\zigongDATA\\");
//
//            int YH = 0;
//            for (File jpg:jpgs
//                    ) {
//                String FJID = UUID.randomUUID().toString();
//                String FJMC = jpg.getName();
//                int postfixIndex = jpg.getName().lastIndexOf(".");
//                String FILETYPE = jpg.getName().substring(postfixIndex);
////
//                DasJnwjFj dasJnwjFj = new DasJnwjFj();
//                dasJnwjFj.setFjid(FJID);
//                dasJnwjFj.setWjid(WJID);
//                dasJnwjFj.setYh(++YH);
//                dasJnwjFj.setFjmc(FJMC);
//                dasJnwjFj.setFjlx(0);
//                dasJnwjFj.setPath(PATH);
//                dasJnwjFj.setFiletype(FILETYPE);
//                dasJnwjFj.setFjid(FJID);
//                dasJnwjFj.setIsrk(0);
//
//                das_jnwj_fjs.add(dasJnwjFj);
//
//            }
//        }
//    }

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
    public void submitData(Zdjbxx zdjbxx, QlrAndSyqList qlrAndSyqList, TdpzytList tdpzytList, TxmList txmList) {

        Zdjbxx zdjbxxInDB = zdjbxxMapper.selectByZddm(zdjbxx.getZddm());
        if (zdjbxxInDB==null){
            //宗地基本信息
            zdjbxx.setObjectid(zdjbxxMapper.findMaxId());
            String zdjbxxBsm = UUID.randomUUID().toString();  //宗地基本信息标识码
            zdjbxx.setBsm(zdjbxxBsm);
            zdjbxxMapper.insertSelective(zdjbxx);
            zdjbxxMapper.setShr(zdjbxx.getShr(),zdjbxx.getBsm());

        }
        else zdjbxx= zdjbxxInDB;


        int i = 0;
        for (QlrAndSyq qas:qlrAndSyqList.getQlrAndSyqs()
             ) {
            //使用权信息
            Jsydsyq jsydsyq = qas.getJsydsyq();
            String syqBsm = UUID.randomUUID().toString();    //使用权标识码
            jsydsyq.setBsm(syqBsm);
            jsydsyq.setBdcdybsm(zdjbxx.getBsm());
            jsydsyq.setBdcdyh(zdjbxx.getBdcdyh());
            jsydsyq.setObjectid(jsydsyqMapper.findMaxId());

            jsydsyqMapper.insertSelective(jsydsyq);
            //权利人信息
            Qlr qlr = qas.getQlr();
            qlr.setBsm(UUID.randomUUID().toString());
            qlr.setBsm(UUID.randomUUID().toString());
            qlr.setQlbsm(syqBsm);
            qlr.setObjectid(qlrMapper.findMaxId());
            qlr.setSxh(new BigDecimal(i++));
            qlr.setBdcdyh(zdjbxx.getBdcdyh());
            qlrMapper.insertSelective(qlr);
        }

        //土地用途信息
        List<Tdpzyt> tdyts = tdpzytList.getTdpzyts();   //土地用途列表
        for (Tdpzyt t : tdyts) {
            t.setObjectid(tdpzytMapper.findMaxId());
            t.setBsm(UUID.randomUUID().toString());
            t.setZdbsm(zdjbxx.getBsm());
            tdpzytMapper.insertSelective(t);
        }

        //档案信息
        for (TxmWithBLOBs t : txmList.getTxms()
             ) {
            t.setZddm(zdjbxx.getZddm());
            t.setTxmid(txmMapper.findMaxId());
            txmMapper.insertSelective(t);
        }


    }


//    @Cacheable(cacheNames = "handlingAJH",key = "#AJH")
    public List<MyFile> getJpgList(String path,String AJH){
        return MyFunction.getJpgList(path);
    }

    @Override
    public PublicExcelData getPublicExcelData(String excelPath, String AJH) throws Exception {
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
                    Cell qlrs = rowFromAJH.getCell(1);
                    if (qlrs!=null)
                    publicDataFromExcel.setQLR(new ArrayList<>(Arrays.asList(qlrs.toString().split("/"))));
                    Cell tdzhs = rowFromAJH.getCell(2);
                    if (tdzhs!=null)
                    publicDataFromExcel.setTDZH(new ArrayList<>(Arrays.asList(tdzhs.toString().split("/"))));
                    Cell fwzh = rowFromAJH.getCell(3);
                    if (fwzh!=null)
                    publicDataFromExcel.setFWZL(fwzh.toString());
                    if (rowFromAJH.getCell(4)==null)
                    publicDataFromExcel.setZDDM("");
                    else {
                        String zddm = rowFromAJH.getCell(4).toString();
                        int zddmIndex = zddm.lastIndexOf(".")==-1?zddm.length():zddm.lastIndexOf(".");
                        publicDataFromExcel.setZDDM(zddm.substring(0,zddmIndex));
                        int flag=0;
                        for (int j = 0; j < zddm.length(); j++) {
                            if ((zddm.charAt(j)>='a'&&zddm.charAt(j)<='z')||(zddm.charAt(j)>='A'&&zddm.charAt(j)<='Z'))
                                flag++;
                            if (flag==2) {
                                publicDataFromExcel.setZDTZM(Character.toString(zddm.charAt(j)));
                                break;
                            }

                        }
                    }



                    if (rowFromAJH.getCell(5)!=null){
                        String fpys = rowFromAJH.getCell(5).toString();
                        int fpysIndex = fpys.lastIndexOf(".")==-1?fpys.length():fpys.lastIndexOf(".");
                        publicDataFromExcel.setFPYS(fpys.substring(0,fpys.lastIndexOf(".")));
                    }

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
