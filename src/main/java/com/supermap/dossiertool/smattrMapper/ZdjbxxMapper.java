package com.supermap.dossiertool.smattrMapper;

import com.supermap.dossiertool.smattrEntity.Zdjbxx;
import com.supermap.dossiertool.smattrEntity.ZdjbxxExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


import java.util.List;

@Mapper
public interface ZdjbxxMapper {
    long countByExample(ZdjbxxExample example);

    int deleteByExample(ZdjbxxExample example);

    int deleteByPrimaryKey(String bsm);

    int insert(Zdjbxx record);

    int insertSelective(Zdjbxx record);

    List<Zdjbxx> selectByExample(ZdjbxxExample example);

    Zdjbxx selectByPrimaryKey(String bsm);

    int updateByExampleSelective(@Param("record") Zdjbxx record, @Param("example") ZdjbxxExample example);

    int updateByExample(@Param("record") Zdjbxx record, @Param("example") ZdjbxxExample example);

    int updateByPrimaryKeySelective(Zdjbxx record);

    int updateByPrimaryKey(Zdjbxx record);
}