package com.supermap.dossiertool.mapper;


import com.supermap.dossiertool.pojo.DasBdc;
import com.supermap.dossiertool.pojo.DasBdcExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


import java.util.List;

@Mapper
public interface DasBdcMapper {
    long countByExample(DasBdcExample example);

    int deleteByExample(DasBdcExample example);

    int insert(DasBdc record);

    int insertSelective(DasBdc record);

    List<DasBdc> selectByExampleWithBLOBs(DasBdcExample example);

    List<DasBdc> selectByExample(DasBdcExample example);

    int updateByExampleSelective(@Param("record") DasBdc record, @Param("example") DasBdcExample example);

    int updateByExampleWithBLOBs(@Param("record") DasBdc record, @Param("example") DasBdcExample example);

    int updateByExample(@Param("record") DasBdc record, @Param("example") DasBdcExample example);
}