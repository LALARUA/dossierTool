package com.supermap.dossiertool.smattrMapper;

import com.supermap.dossiertool.smattrEntity.Tdpzyt;
import com.supermap.dossiertool.smattrEntity.TdpzytExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


import java.util.List;

@Mapper
public interface TdpzytMapper {
    long countByExample(TdpzytExample example);

    int deleteByExample(TdpzytExample example);

    int deleteByPrimaryKey(String bsm);

    int insert(Tdpzyt record);

    int insertSelective(Tdpzyt record);

    List<Tdpzyt> selectByExample(TdpzytExample example);

    Tdpzyt selectByPrimaryKey(String bsm);

    int updateByExampleSelective(@Param("record") Tdpzyt record, @Param("example") TdpzytExample example);

    int updateByExample(@Param("record") Tdpzyt record, @Param("example") TdpzytExample example);

    int updateByPrimaryKeySelective(Tdpzyt record);

    int updateByPrimaryKey(Tdpzyt record);
}