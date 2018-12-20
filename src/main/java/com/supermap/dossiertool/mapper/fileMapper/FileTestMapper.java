package com.supermap.dossiertool.mapper.fileMapper;

import com.supermap.dossiertool.pojo.FileTest;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @Author: xiangXX
 * @Description:
 * @Date Created in 20:15 2018/12/20 0020
 */
@Mapper
public interface FileTestMapper {
    @Select("select * from bdck_djq where smid = #{smid}")
    FileTest findById(int smid);

}
