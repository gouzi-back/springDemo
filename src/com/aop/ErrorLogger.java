package com.aop;


import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;

import java.util.Arrays;

/**
 * 增强处理类
 * @Auther:haha
 * @Date:2021/1/29 - 01 - 29 14:24
 * @Description:com.aop
 * @Version: 1.0
 */
public class ErrorLogger {
    private static Logger log= Logger.getLogger(ErrorLogger.class);
    public void afterThrowing(JoinPoint jp,RuntimeException e){
        log.error(jp.getSignature().getName()+"方法发生异常"+e);
    }


}
