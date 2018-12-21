package com.supermap.dossiertool.mapper;

import com.supermap.dossiertool.pojo.DAS_AJJBXX;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @Author: xiangXX
 * @Description:
 * @Date Created in 16:35 2018/12/21 0021
 */
@Mapper
public interface DAS_AJJBXXMapper {
    @Insert("insert into DAS_AJJBXX(AJID,ND,QZH,AJH,WJJS,WJYS,BCQX,SCRQ,YXBZ) values(#{AJID},#{ND},#{QZH},#{AJH},#{WJJS},#{WJYS},#{BCQX},#{SCRQ},#{YXBZ})")
    void insert(DAS_AJJBXX das_ajjbxx);
}
