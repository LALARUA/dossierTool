package com.supermap.dossiertool.smattrMapper;

import com.supermap.dossiertool.smattrEntity.Qlr;
import com.supermap.dossiertool.smattrEntity.QlrExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface QlrMapper {
    long countByExample(QlrExample example);

    int deleteByExample(QlrExample example);

    int deleteByPrimaryKey(String bsm);

    int insert(Qlr record);

    int insertSelective(Qlr record);

    List<Qlr> selectByExample(QlrExample example);

    Qlr selectByPrimaryKey(String bsm);

    int updateByExampleSelective(@Param("record") Qlr record, @Param("example") QlrExample example);

    int updateByExample(@Param("record") Qlr record, @Param("example") QlrExample example);

    int updateByPrimaryKeySelective(Qlr record);

    int updateByPrimaryKey(Qlr record);
}