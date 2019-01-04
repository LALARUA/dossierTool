package com.supermap.dossiertool.smattrMapper;

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
    public void setShr(@Param("shr") String shr,@Param("bsm") String bsm);

    @Select("select * from zdjbxx where zddm=#{zddm}")
    public Zdjbxx selectByZddm(String zddm);
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