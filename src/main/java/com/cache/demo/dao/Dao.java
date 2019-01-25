package com.cache.demo.dao;

import com.cache.demo.bean.User;
import org.springframework.cache.annotation.Cacheable;

/**
 * @author wanghongchao
 * @mail wanghongchao@sinosoft.com.cn
 * @time 2019/1/25
 */
public interface Dao {
    @Cacheable(value = "User")
    User findUserByName(String name);
}
