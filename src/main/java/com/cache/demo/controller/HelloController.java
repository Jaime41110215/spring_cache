package com.cache.demo.controller;

import com.cache.demo.bean.User;
import com.cache.demo.service.UserService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.impl.LogFactoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wanghongchao
 * @mail wanghongchao@sinosoft.com.cn
 * @time 2019/1/25
 */
@RestController
public class HelloController {
    LogFactory logFactory = new LogFactoryImpl();

    @Autowired
    UserService userService;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public User getHello(){
        Log log = logFactory.getInstance(this.getClass().getName());
        log.info("hello=====================================================");
        return new User("tom","123");
    }

    @RequestMapping(value = "/getUser/{name}",method = RequestMethod.GET)
    public User getUser(@PathVariable(value = "name")String name){
        return userService.findUserByName(name);
    }
}
