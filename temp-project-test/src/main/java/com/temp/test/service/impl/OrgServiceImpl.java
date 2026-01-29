package com.temp.test.service.impl;


import com.fresh.xy.mb.core.BaseServiceImpl;
import com.temp.test.entity.Org;
import com.temp.test.mapper.DepMapper;
import com.temp.test.mapper.OrgMapper;
import com.temp.test.service.OrgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class OrgServiceImpl extends BaseServiceImpl<Long, Org, OrgMapper> implements OrgService<Long, Org> {

    @Autowired
    private OrgMapper orgMapper;

    @Autowired
    private DepMapper depMapper;

    @Transactional
    @Override
    public int deleteOrg(Long id) {
        int ret = orgMapper.deleteById(id);
        depMapper.deleteByOrgId(id);

        return ret;
    }
}
