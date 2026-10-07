package com.fresh.temp.yui.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fresh.temp.yui.enums.DepType;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Getter
@Setter
public class DepAddDto {

    private String depName;
    @NotNull(message = "depNo不能为空")
    private Byte depNo;
    private Long orgId;
    //@NotNull(message = "未传depType参数或者值不合法")
    private DepType depType;

    /*@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT+8")  //json序列化与反序列化的格式化器
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")  //spring中日期格式化器
    private LocalDateTime createTime;*/

    /*@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime modifyTime;*/
}
