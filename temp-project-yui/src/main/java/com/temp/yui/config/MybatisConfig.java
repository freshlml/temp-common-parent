package com.temp.test.config;

import com.fresh.xy.mb.core.PageInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.temp.test.**.mapper")  //classpath*:com/temp/test/**/mapper/**/*.class
public class MybatisConfig {

    @Bean
    public PageInterceptor pageInterceptor() {
        return new PageInterceptor();
    }
}
