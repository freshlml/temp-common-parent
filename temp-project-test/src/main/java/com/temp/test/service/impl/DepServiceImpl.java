package com.temp.test.service.impl;


import com.fresh.xy.mb.core.BaseServiceImpl;
import com.temp.test.entity.Dep;
import com.temp.test.mapper.DepMapper;
import com.temp.test.service.DepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepServiceImpl extends BaseServiceImpl<Long, Dep, DepMapper> implements DepService {

    @Autowired
    private DepMapper depMapper;

}
