package com.supermap.dossiertool.smattrMapper;

import com.supermap.dossiertool.bean.SelectZdxx;
import com.supermap.dossiertool.smattrEntity.Zdjbxx;
import com.supermap.dossiertool.smattrEntity.ZdjbxxExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;


import java.math.BigDecimal;
import java.util.List;

@Mapper
public interface ZdjbxxMapper {
    @Select("SELECT S_ZDJBXX.NEXTVAL FROM DUAL")
    BigDecimal findMaxId();

    @Update("update zdjbxx set shr = #{shr} where bsm = #{bsm}")
    void setShr(@Param("shr") String shr,@Param("bsm") String bsm);

    @Select("select * from zdjbxx where zddm=#{zddm}")
    Zdjbxx selectByZddm(String zddm);

//    @Select("SELECT * FROM ZDJBXX WHERE ZDDM IN (SELECT ZDDM FROM JSYDSYQ WHERE BSM IN (SELECT QLBSM FROM QLR WHERE QLRMC = #{qlr}))\n" +
//            "UNION SELECT * FROM ZDJBXX WHERE ZDDM = #{zddm}" +
//            "UNION SELECT * FROM ZDJBXX WHERE DJH = #{djh}" +
//            "UNION SELECT * FROM ZDJBXX WHERE ZL LIKE #{zdzl}")
    List<Zdjbxx> selectZdxx(SelectZdxx selectZdxx);

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