package com.cache.demo.config;

import com.cache.demo.config.trans_config.RedisCachingConfigurer;
import org.springframework.cache.annotation.CachingConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author wanghongchao
 * @mail wanghongchao@sinosoft.com.cn
 * @time 2019/1/23
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.cache.demo.*")
public class ServletConfig {
    @Bean
    public CachingConfigurer cachingConfigurer(){
        return new RedisCachingConfigurer();
    }
}
