package com.springDemo;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.applet.AppletContext;

import static org.junit.Assert.*;

/**
 * @Auther:haha
 * @Date:2021/1/28 - 01 - 28 21:35
 * @Description:com.springDemo
 * @Version: 1.0
 */
public class HelloSpringTest {

    @Before
    public void setUp() throws Exception {
    }
    @Test
    public void test(){
        //ClassPathXmlApplicationContext读取配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        HelloSpring helloSpring=(HelloSpring) context.getBean("helloSpring");
        helloSpring.print();

    }
}