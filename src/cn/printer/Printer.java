package cn.printer;

import cn.printer.Ink;
import cn.printer.Paper;

/**
 * 打印机类
 * @Auther:haha
 * @Date:2021/1/29 - 01 - 29 12:59
 * @Description:cn.ink
 * @Version: 1.0
 */
public class Printer {
    //面向接口编程  定义ink接口变量
    private Ink ink;
    //面向结口编程 定义paper接口变量；
    private Paper paper;

    public Ink getInk() {

        return ink;
    }

    public void setInk(Ink ink) {
        this.ink = ink;
    }

    public Paper getPaper() {
        return paper;
    }

    public void setPaper(Paper paper) {
        this.paper = paper;
    }

    public void print(String str){
        System.out.println("使用"+ink.getColoer(225,200,212)+"颜色打印\n");
        for (int i = 0; i < str.length(); i++) {
            paper.putInchar(str.charAt(i));

        }
        System.out.println(paper.getContext());

    }
}
