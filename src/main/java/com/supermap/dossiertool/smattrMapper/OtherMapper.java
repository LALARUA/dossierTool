package com.supermap.dossiertool.smattrMapper;

import com.supermap.dossiertool.bean.Djqx;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author: xiangXX
 * @Description:
 * @Date Created in 10:51 2019/1/2 0002
 */
@Mapper
public interface OtherMapper {

    @Select("SELECT ${_parameter}dm as dm,${_parameter}mc AS mc from ${_parameter} ORDER BY ${_parameter}mc")
     List<Djqx> djqxs(String tableName);

}
