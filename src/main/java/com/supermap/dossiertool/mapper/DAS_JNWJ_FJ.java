package com.supermap.dossiertool.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.omg.CORBA.portable.ValueOutputStream;

/**
 * @Author: xiangXX
 * @Description:
 * @Date Created in 16:51 2018/12/21 0021
 */
@Mapper
public interface DAS_JNWJ_FJ {
    @Insert("insert into DAS_JNWJ_FJ(FJID,WJID,YH,FJMC,FJLX,PATH,FILETYPE,JNWJ_FJ_ID,ISRK) values(#{FJID},#{WJID},#{YH},#{FJMC},#{FJMC},#{FJLX},#{PATH},#{FILETYPE},#{JNWJ_FJ_ID},#{ISRK})")
    void insert(com.supermap.dossiertool.pojo.DAS_JNWJ_FJ das_jnwj_fj);
}
