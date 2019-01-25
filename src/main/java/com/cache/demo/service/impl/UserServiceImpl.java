package com.cache.demo.service.impl;

import com.cache.demo.bean.User;
import com.cache.demo.dao.Dao;
import com.cache.demo.dao.UserDao;
import com.cache.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wanghongchao
 * @mail wanghongchao@sinosoft.com.cn
 * @time 2019/1/25
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private Dao userDao;

    public User findUserByName(String name) {
        return userDao.findUserByName(name);
    }
}
