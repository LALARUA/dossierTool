package com.supermap.dossiertool.service.serviceImpl;

import com.supermap.dossiertool.bean.MyFile;
import com.supermap.dossiertool.function.MyFunction;
import com.supermap.dossiertool.pojo.*;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.File;
import java.util.*;

/**
 * @Author: xiangXX
 * @Description:
 * @Date Created in 10:57 2018/12/22 0022
 */
@Service
public class HandleDataService {

    /**
     * @description
     * @author xiangXX
     * @date 2018/12/22 0022 15:49
      * @param folderPath 需要读取图片所在的文件夹路径
     *
     */
    @Transactional
    public void insertData(String folderPath) throws Exception{
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
        int WJJS = 0;  //图片种类数
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
        int ND = Integer.valueOf(TDZH.substring(leftBracketIndex+1,rightBracketIndex));
        String AJID = UUID.randomUUID().toString();
        DAS_AJJBXX das_ajjbxx = new DAS_AJJBXX(AJID, ND, TDZH, AJH, WJJS, WJYS, 0, new Date(), 0);
        System.out.println(das_ajjbxx);


        //DAS_BDC数据
        String BDCID = UUID.randomUUID().toString();
        DAS_BDC das_bdc = new DAS_BDC(BDCID, AJID, TDZH, FWZL, QLR, "DAS_CQ", TDZH);

        //DAS_CQ数据
        String ID = UUID.randomUUID().toString();
        DAS_CQ das_cq = new DAS_CQ(ID, AJID, QLR, TDZH, FWZL);

        //DAS_JNWJ数据
        int SXH = 0;       //顺序号
        List<DAS_JNWJ> das_jnwjs = new ArrayList<>();
        List<DAS_JNWJ_FJ> das_jnwj_fjs = new ArrayList<>();
        for (Map.Entry<String,List<File>> entry:map.entrySet()
                ) {
            String TM = entry.getKey();
            String WJID = UUID.randomUUID().toString();
            List<File>  jpgs = entry.getValue();        //该种类下的图片
            int YS = jpgs.size();
            das_jnwjs.add(new DAS_JNWJ(WJID,AJID,++SXH,TM,YS));
            //DAS_JNWJ_FJ数据
//            int relativePathIndex = folderPath.indexOf("E:\\zigongDATA\\");
            String PATH = folderPath.substring("E:\\zigongDATA\\".length()-1);
            int YH = 0;
            for (File jpg:jpgs
                    ) {
                String FJID = UUID.randomUUID().toString();
                String FJMC = jpg.getName();
                int postfixIndex = jpg.getName().lastIndexOf(".");
                String FILETYPE = jpg.getName().substring(postfixIndex);
                das_jnwj_fjs.add(new DAS_JNWJ_FJ(FJID,WJID,++YH,FJMC,0,PATH,FILETYPE,FJID,0));
            }
        }
    }

    @Cacheable(cacheNames = "handlingAJH",key = "#AJH")
    public List<MyFile> getJpgList(String path,String AJH){

        return MyFunction.getJpgList(path);
    }

}
