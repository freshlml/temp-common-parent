package com.temp.test.entity;

import com.fresh.xy.common.entity.BaseEntity;
import com.temp.test.enums.DepType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Dep extends BaseEntity<Long> {

    private String depName;
    private Byte depNo;
    private Long orgId;
    private DepType depType;
    //private String depTypeValue; //DepType#getValue()

}
