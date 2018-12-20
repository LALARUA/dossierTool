package com.supermap.dossiertool.mapper.dossierMapper;

import com.supermap.dossiertool.pojo.DossierTest;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @Author: xiangXX
 * @Description:
 * @Date Created in 17:01 2018/12/20 0020
 */
@Mapper
public interface DossierTestMapper {

    @Select("select * from wfd_acttype where acttype_id = #{acttype_id}")
    DossierTest findById(int acttype_id);
}
