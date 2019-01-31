package com.supermap.dossiertool.smattrMapper;

import com.supermap.dossiertool.smattrEntity.Txmqlb;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.math.BigDecimal;

/**
 * @Author: xiangXX
 * @Description:
 * @Date Created in 12:44 2019/1/31 0031
 */
@Mapper
public interface TxmqlbMapper {

    @Select("SELECT TXMQLB_SEQ.NEXTVAL FROM DUAL")
    Integer findMaxId();

    @Insert("insert into txmqlb(TXMID,QLBSM,BDCQZH,QLRMC,QLRBSM,XTDZZL) VALUES(#{txmId},#{qlbsm},#{bdcqzh},#{qlrmc},#{qlrbsm},#{xtdzzl})")
    void insert(Txmqlb txmqlb);
}
