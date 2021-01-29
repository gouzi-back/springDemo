package cn.ink;

import cn.printer.Ink;

import java.awt.*;

/**
 * 灰色打印机
 * @Auther:haha
 * @Date:2021/1/29 - 01 - 29 12:40
 * @Description:cn.ink
 * @Version: 1.0
 */
public class GreyInk implements Ink {
    @Override
    public String getColoer(int r, int g, int b) {
        int c=(r+g+b)/3;
        Color color =new Color(c,c,c);

        return "#"+Integer.toHexString(color.getRGB()).substring(2);
    }
}
