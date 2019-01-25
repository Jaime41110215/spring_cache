package com.cache.demo.dao;

import com.cache.demo.bean.User;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

/**
 * @author wanghongchao
 * @mail wanghongchao@sinosoft.com.cn
 * @time 2019/1/25
 */
@Repository
public class UserDao implements Dao {
    private static ArrayList<User> database = new ArrayList();
    private static int INIT_SIZE = 10;
    static {
        for (int i = 0; i < INIT_SIZE; i++){
            database.add(new User("tom" + i,"123"));
        }
    }


    public User findUserByName(String name) {
        System.out.println("begin==========================");
        for (User u : database) {
            if(name.equals(u.getName())){
                System.out.println("end==========================");
                return u;
            }
        }
        //System.out.println("end==========================");
        return null;
    }
}
