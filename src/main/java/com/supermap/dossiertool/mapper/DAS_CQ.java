package com.supermap.dossiertool.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: xiangXX
 * @Description:
 * @Date Created in 16:47 2018/12/21 0021
 */
@Mapper
public interface DAS_CQ {
    @Insert("insert into DAS_CQ(ID,AJID,SYQR,QZH,ZL) values(#{ID},#{AJID},#{SYQR},#{QZH},#{ZL})")
    void insert(DAS_CQ das_cq);
}
