package com.cache.demo.config.trans_config;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurer;
import org.springframework.cache.interceptor.CacheErrorHandler;
import org.springframework.cache.interceptor.CacheResolver;
import org.springframework.cache.interceptor.KeyGenerator;

/**
 * @author wanghongchao
 * @mail wanghongchao@sinosoft.com.cn
 * @time 2019/1/25
 */
public class RedisCachingConfigurer implements CachingConfigurer {
    public CacheManager cacheManager() {
        return null;
    }

    public CacheResolver cacheResolver() {
        return null;
    }

    public KeyGenerator keyGenerator() {
        return new SpringCachingKeyGenerator();
    }

    public CacheErrorHandler errorHandler() {
        return null;
    }
}
