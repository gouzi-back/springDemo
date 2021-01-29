package com.aop;


import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;

/**
 * 增强处理类
 * @Auther:haha
 * @Date:2021/1/29 - 01 - 29 14:24
 * @Description:com.aop
 * @Version: 1.0
 */
public class AfterLogger {
    private static Logger log= Logger.getLogger(AfterLogger.class);
    public void after(JoinPoint jp){
        log.info(jp.getSignature().getName()+"方法结束了");
    }


}
