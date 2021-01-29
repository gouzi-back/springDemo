package cn.printer;

/**
 * 打印采用纸张接口
 * @Auther:haha
 * @Date:2021/1/29 - 01 - 29 12:36
 * @Description:cn.printer
 * @Version: 1.0
 */
public interface Paper {
    public static  final  String newLine="\r\n";
    /*往纸张中逐个字符输出
    * */
    public  void putInchar(char c);
    /*
    * 得到输出到纸张中的内容
    * */
    public  String getContext();
}
