package com.supermap.dossiertool.smattrMapper;

import com.supermap.dossiertool.smattrEntity.Jsydsyq;
import com.supermap.dossiertool.smattrEntity.JsydsyqExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


import java.util.List;

@Mapper
public interface JsydsyqMapper {
    long countByExample(JsydsyqExample example);

    int deleteByExample(JsydsyqExample example);

    int deleteByPrimaryKey(String bsm);

    int insert(Jsydsyq record);

    int insertSelective(Jsydsyq record);

    List<Jsydsyq> selectByExample(JsydsyqExample example);

    Jsydsyq selectByPrimaryKey(String bsm);

    int updateByExampleSelective(@Param("record") Jsydsyq record, @Param("example") JsydsyqExample example);

    int updateByExample(@Param("record") Jsydsyq record, @Param("example") JsydsyqExample example);

    int updateByPrimaryKeySelective(Jsydsyq record);

    int updateByPrimaryKey(Jsydsyq record);
}