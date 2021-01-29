package cn.ink;

import cn.printer.Ink;

import java.awt.*;

/**
 * 彩色墨盒
 * @Auther:haha
 * @Date:2021/1/29 - 01 - 29 12:43
 * @Description:cn.ink
 * @Version: 1.0
 */
public class ColorInk implements Ink {
    @Override
    public String getColoer(int r, int g, int b) {
        Color color =new Color(r,g,b);

        return "#"+Integer.toHexString(color.getRGB()).substring(2);

    }
}
