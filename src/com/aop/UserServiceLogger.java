package com.aop;


import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;

import java.util.Arrays;

/**
 * @Auther:haha
 * @Date:2021/1/29 - 01 - 29 14:24
 * @Description:com.aop
 * @Version: 1.0
 */
public class UserServiceLogger {
    private static Logger log= Logger.getLogger(UserServiceLogger.class);
    public void before(JoinPoint jp){
        log.info("调用"+jp.getTarget()+"的"+jp.getSignature()+"方法的参数"+ Arrays.toString(jp.getArgs()));
    }

    public void afterReturning(JoinPoint jp,Object result){
        log.info("调用"+jp.getTarget()+"的"+jp.getSignature()+"方法的返回值"+result);
    }
}
