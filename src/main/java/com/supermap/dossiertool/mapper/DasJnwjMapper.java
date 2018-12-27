package com.supermap.dossiertool.mapper;


import com.supermap.dossiertool.pojo.DasJnwj;
import com.supermap.dossiertool.pojo.DasJnwjExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


import java.util.List;

@Mapper
public interface DasJnwjMapper {
    long countByExample(DasJnwjExample example);

    int deleteByExample(DasJnwjExample example);

    int insert(DasJnwj record);

    int insertSelective(DasJnwj record);

    List<DasJnwj> selectByExample(DasJnwjExample example);

    int updateByExampleSelective(@Param("record") DasJnwj record, @Param("example") DasJnwjExample example);

    int updateByExample(@Param("record") DasJnwj record, @Param("example") DasJnwjExample example);
}