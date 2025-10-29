package com.jsy.lease.common.mybatisplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.jsy.lease.web.*.mapper")
public class MybatisPlusConfiguration {

}
