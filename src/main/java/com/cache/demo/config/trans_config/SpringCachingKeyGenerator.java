package com.cache.demo.config.trans_config;

import org.springframework.cache.interceptor.KeyGenerator;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author wanghongchao
 * @mail wanghongchao@sinosoft.com.cn
 * @time 2019/1/25
 */
public class SpringCachingKeyGenerator implements KeyGenerator {
    public Object generate(Object target, Method method, Object... params) {
        StringBuilder sb = new StringBuilder();
        sb.append(target.getClass().getName());
        sb.append("#");
        sb.append(method.getName());
        sb.append("_");
        sb.append(Arrays.deepHashCode(params));
        return sb.toString();
    }
}
