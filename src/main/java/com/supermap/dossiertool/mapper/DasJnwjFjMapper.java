package com.supermap.dossiertool.mapper;


import com.supermap.dossiertool.pojo.DasJnwjFj;
import com.supermap.dossiertool.pojo.DasJnwjFjExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;



import java.util.List;

@Mapper
public interface DasJnwjFjMapper {
    long countByExample(DasJnwjFjExample example);

    int deleteByExample(DasJnwjFjExample example);

    int insert(DasJnwjFj record);

    int insertSelective(DasJnwjFj record);

    List<DasJnwjFj> selectByExample(DasJnwjFjExample example);

    int updateByExampleSelective(@Param("record") DasJnwjFj record, @Param("example") DasJnwjFjExample example);

    int updateByExample(@Param("record") DasJnwjFj record, @Param("example") DasJnwjFjExample example);
}