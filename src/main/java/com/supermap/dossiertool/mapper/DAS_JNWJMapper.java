package com.supermap.dossiertool.mapper;

import com.supermap.dossiertool.pojo.DAS_JNWJ;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: xiangXX
 * @Description:
 * @Date Created in 16:49 2018/12/21 0021
 */
@Mapper
public interface DAS_JNWJMapper {
    @Insert("insert into DAS_JNWJ(WJID,AJID,SXH,TM,YS) values(#{WJID},#{AJID},#{SXH},#{TM},#{YS})")
    void insert(DAS_JNWJ das_jnwj);
}
