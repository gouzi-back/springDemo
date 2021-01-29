package com.springDemo;

import edu.entity.User;

import edu.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther:haha
 * @Date:2021/1/29 - 01 - 29 14:56
 * @Description:com.springDemo
 * @Version: 1.0
 */
public class IocTest {
    @Test
    public  void aopTest(){
        ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext2.xml");
        UserService userService=(UserService) context.getBean("usService");
        User user =new User();
        user.setId(1);
        user.setUsername("hahah");
        user.setPassword("1ddddd");
        user.setEmail("11111@.com");
        userService.addNewUser(user);


    }
}
