package com.supermap.dossiertool.smattrMapper;

import com.supermap.dossiertool.bean.QlrAndSyq;
import com.supermap.dossiertool.smattrEntity.Qlr;
import com.supermap.dossiertool.smattrEntity.QlrExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.math.BigDecimal;
import java.util.List;

@Mapper
public interface QlrMapper {
    @Select("SELECT S_QLR.NEXTVAL FROM DUAL")
    BigDecimal findMaxId();

    @Select("SELECT * FROM QLR WHERE BSM IN (SELECT qlrbsm FROM TXMQLB WHERE TXMID = #{txmId})")
    List<Qlr> selectByTxmId(Integer txmId);

    List<QlrAndSyq> selectQlrAndSyqs(Integer txmId);

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