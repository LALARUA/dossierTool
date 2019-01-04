package com.supermap.dossiertool.smattrMapper;

import com.supermap.dossiertool.smattrEntity.Txm;
import com.supermap.dossiertool.smattrEntity.TxmExample;
import com.supermap.dossiertool.smattrEntity.TxmWithBLOBs;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;


import java.math.BigDecimal;
import java.util.List;

@Mapper
public interface TxmMapper {
    @Select("SELECT TXM_SEQ.NEXTVAL FROM DUAL")
    short findMaxId();
    long countByExample(TxmExample example);

    int deleteByExample(TxmExample example);

    int insert(TxmWithBLOBs record);

    int insertSelective(TxmWithBLOBs record);

    List<TxmWithBLOBs> selectByExampleWithBLOBs(TxmExample example);

    List<Txm> selectByExample(TxmExample example);

    int updateByExampleSelective(@Param("record") TxmWithBLOBs record, @Param("example") TxmExample example);

    int updateByExampleWithBLOBs(@Param("record") TxmWithBLOBs record, @Param("example") TxmExample example);

    int updateByExample(@Param("record") Txm record, @Param("example") TxmExample example);
}