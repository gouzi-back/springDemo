package com.service.impl;

import com.dao.UserDao;
import com.entity.User;
import com.service.UserService;

/**
 * @Auther:haha
 * @Date:2021/1/29 - 01 - 29 14:17
 * @Description:com.service.impl
 * @Version: 1.0
 */
public class UserServiceImpl implements UserService {
    private UserDao dao;
    //为dao赋值的有参构造方法
    public UserServiceImpl(UserDao dao) {
        this.dao = dao;
    }
    //无参构造
    public UserServiceImpl() {
    }

    public UserDao getDao() {
        return dao;
    }

    public void setDao(UserDao dao) {
        this.dao = dao;
    }

    @Override
    public void addNewUser(User user) {
        dao.save(user);
    }
}
