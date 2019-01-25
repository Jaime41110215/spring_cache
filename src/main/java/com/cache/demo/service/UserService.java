package com.cache.demo.service;

import com.cache.demo.bean.User;

/**
 * @author wanghongchao
 * @mail wanghongchao@sinosoft.com.cn
 * @time 2019/1/25
 */
public interface UserService {
    User findUserByName(String name);
}
