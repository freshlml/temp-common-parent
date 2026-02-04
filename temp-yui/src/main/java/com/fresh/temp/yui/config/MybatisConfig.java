package com.fresh.temp.yui.config;

import com.fresh.xy.mb.core.PageInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.fresh.temp.yui.**.mapper")  //classpath*:com/fresh/temp/yui/**/mapper/**/*.class
public class MybatisConfig {

    @Bean
    public PageInterceptor pageInterceptor() {
        return new PageInterceptor();
    }
}
