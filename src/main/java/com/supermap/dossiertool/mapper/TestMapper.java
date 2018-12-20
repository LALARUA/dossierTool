package com.supermap.dossiertool.mapper;

import com.supermap.dossiertool.pojo.Test;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Service;

/**
 * @Author: xiangXX
 * @Description:
 * @Date Created in 17:01 2018/12/20 0020
 */
@Mapper
public interface TestMapper {

    @Select("select * from answer where answer_id = #{id}")
    public Test findById(int id);
}
