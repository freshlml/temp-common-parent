package com.temp.test.mapper;

import com.fresh.xy.mb.core.BaseMapper;
import com.temp.test.entity.Org;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrgMapper extends BaseMapper<Long, Org> {

}
