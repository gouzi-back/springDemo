package com.springDemo;

/**
 * @Auther:haha
 * @Date:2021/1/28 - 01 - 28 21:06
 * @Description:com.springDemo
 * @Version: 1.0
 */
public class HelloSpring {
    //定义变量问候  他的值通过spring框架注入
    private String who;
    //定打印方法
    public void print(){
        System.out.println("你好"+this.getWho());
    }
    /**
     * 获取who
     * @return
     */
    public String getWho() {

        return who;
    }

    /**
     * 给who赋值
     * @return
     */
    public void setWho(String who) {
        this.who = who;
    }
}
