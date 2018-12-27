package com.supermap.dossiertool.mapper;


import com.supermap.dossiertool.pojo.DasAjjbxx;
import com.supermap.dossiertool.pojo.DasAjjbxxExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


import java.util.List;

@Mapper
public interface DasAjjbxxMapper {
    long countByExample(DasAjjbxxExample example);

    int deleteByExample(DasAjjbxxExample example);

    int insert(DasAjjbxx record);

    int insertSelective(DasAjjbxx record);

    List<DasAjjbxx> selectByExample(DasAjjbxxExample example);

    int updateByExampleSelective(@Param("record") DasAjjbxx record, @Param("example") DasAjjbxxExample example);

    int updateByExample(@Param("record") DasAjjbxx record, @Param("example") DasAjjbxxExample example);
}