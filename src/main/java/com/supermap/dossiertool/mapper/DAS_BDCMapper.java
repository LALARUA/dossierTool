package com.supermap.dossiertool.mapper;

import com.supermap.dossiertool.pojo.DAS_BDC;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: xiangXX
 * @Description:
 * @Date Created in 16:44 2018/12/21 0021
 */
@Mapper
public interface DAS_BDCMapper {
    @Insert("insert into DAS_BDC(BDCID,AJID,BDCQZH,ZL,SYQR,YWLX,QZH) values(#{BDCID},#{AJID},#{BDCQZH},#{ZL},#{SYQR},#{YWLX},#{QZH})")
    void insert(DAS_BDC das_bdc);

}
