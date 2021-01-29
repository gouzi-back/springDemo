package com.dao.impl;

import com.dao.UserDao;
import com.entity.User;

/**
 * @Auther:haha
 * @Date:2021/1/29 - 01 - 29 14:12
 * @Description:com.dao.impl
 * @Version: 1.0
 */
public class UserDaoIMpl implements UserDao {
    @Override
    public void save(User user) {
        System.out.println("保存用户资料");

    }
}
