package com.cache.demo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author wanghongchao
 * @mail wanghongchao@sinosoft.com.cn
 * @time 2019/1/23
 */
@Configuration
@ComponentScan(basePackages = "com.cache.demo.*",
        excludeFilters = @Filter(type = FilterType.ANNOTATION,value = EnableWebMvc.class))
public class RootConfig {

}
