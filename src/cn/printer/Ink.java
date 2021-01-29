package cn.printer;

/**
 * 墨盒接口
 * @Auther:haha
 * @Date:2021/1/29 - 01 - 29 12:33
 * @Description:cn.printer
 * @Version: 1.0
 */
public interface Ink {
    /*
    * 定义打印机采用的颜色值
    *红色值
    * 绿色值
    * 蓝色值
    * */

    public String getColoer(int r,int g,int b);
}
