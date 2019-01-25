package com.cache.demo.bean;

import java.io.Serializable;

/**
 * @author wanghongchao
 * @mail wanghongchao@sinosoft.com.cn
 * @time 2019/1/25
 */
public class User implements Serializable {
    private String name;
    private String passwd;

    public User() {
    }

    public User(String name, String passwd) {
        this.name = name;
        this.passwd = passwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
}
