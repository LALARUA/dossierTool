package com.supermap.dossiertool.smattrMapper;

import com.supermap.dossiertool.smattrEntity.Const;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author: xiangXX
 * @Description:
 * @Date Created in 11:07 2018/12/29 0029
 */
@Mapper
public interface ConstMapper {
    @Select("select * from CONST,CONSTCLS WHERE CONST.CONSTSLSID=CONSTCLS.CONSTSLSID AND CONSTCLS.CONSTCLSTYPE=#{constclsType}")
    public List<Const> getSelected(String constclsType);
}
