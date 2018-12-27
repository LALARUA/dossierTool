package com.supermap.dossiertool.mapper;


import com.supermap.dossiertool.pojo.DasCq;
import com.supermap.dossiertool.pojo.DasCqExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


import java.util.List;

@Mapper
public interface DasCqMapper {
    long countByExample(DasCqExample example);

    int deleteByExample(DasCqExample example);

    int insert(DasCq record);

    int insertSelective(DasCq record);

    List<DasCq> selectByExample(DasCqExample example);

    int updateByExampleSelective(@Param("record") DasCq record, @Param("example") DasCqExample example);

    int updateByExample(@Param("record") DasCq record, @Param("example") DasCqExample example);
}