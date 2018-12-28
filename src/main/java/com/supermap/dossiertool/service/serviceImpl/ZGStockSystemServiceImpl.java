package com.supermap.dossiertool.service.serviceImpl;

import com.supermap.dossiertool.bean.MyFile;
import com.supermap.dossiertool.function.MyFunction;
import com.supermap.dossiertool.mapper.*;
import com.supermap.dossiertool.pojo.*;
import com.supermap.dossiertool.service.ZGStockSystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.File;
import java.nio.file.Path;
import java.util.*;

/**
 * @Author: xiangXX
 * @Description:
 * @Date Created in 10:57 2018/12/22 0022
 */
@Service
public class ZGStockSystemServiceImpl implements ZGStockSystemService{
    @Autowired
    DasAjjbxxMapper dasAjjbxxMapper;
    @Autowired
    DasBdcMapper dasBdcMapper;
    @Autowired
    DasCqMapper dasCqMapper;
    @Autowired
    DasJnwjMapper dasJnwjMapper;
    @Autowired
    DasJnwjFjMapper dasJnwjFjMapper;

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
        dasAjjbxxMapper.insertSelective(das_ajjbxx);



        //DAS_BDC数据
        String BDCID = UUID.randomUUID().toString();
        das_bdc.setBdcid(BDCID);
        das_bdc.setAjid(AJID);
        das_bdc.setBdcqzh(TDZH);
        das_bdc.setZl(FWZL);
        das_bdc.setSyqr(QLR);
        das_bdc.setYwlx("DAS_CQ");
        das_bdc.setQzh(TDZH);
        dasBdcMapper.insertSelective(das_bdc);


        //DAS_CQ数据
        String ID = UUID.randomUUID().toString();
        das_cq.setId(ID);
        das_cq.setAjid(AJID);
        das_cq.setSyqr(QLR);
        das_cq.setQzh(TDZH);
        das_cq.setZl(FWZL);
        dasCqMapper.insertSelective(das_cq);


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
            dasJnwjMapper.insertSelective(dasJnwj);
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
                dasJnwjFjMapper.insertSelective(dasJnwjFj);
                das_jnwj_fjs.add(dasJnwjFj);

            }
        }
    }

    @Cacheable(cacheNames = "handlingAJH",key = "#AJH")
    public List<MyFile> getJpgList(String path,String AJH){

        return MyFunction.getJpgList(path);
    }

}
