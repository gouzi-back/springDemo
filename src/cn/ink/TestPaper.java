package cn.ink;

import cn.printer.Paper;

/**
 * @Auther:haha
 * @Date:2021/1/29 - 01 - 29 12:45
 * @Description:cn.ink
 * @Version: 1.0
 */
public class TestPaper implements Paper {
    //每一行能输入的字符数
    private  int charPerLine=16;
    //每页的行数
    private int linePerPage=8;
    //当前的横向位置 从0开始一直到charPerLine-1
    private int posx=0;
    //当前行号
    private int posy =0;
    //当前页号
    private int posp=0;
    //纸张的内容
    private String context="";
    public int getCharPerLine() {

        return charPerLine;
    }

    public void setCharPerLine(int charPerLine) {
        this.charPerLine = charPerLine;
    }

    public int getLinePerPage() {
        return linePerPage;
    }

    public void setLinePerPage(int linePerPage) {
        this.linePerPage = linePerPage;
    }

    @Override
    public void putInchar(char c) {
        context += c;
        ++posx;
        //判断换行
        if (posx==charPerLine){
            context+=Paper.newLine;
            posx=0;
            ++posy;
        }
        //判断是否换页
        if (posy==linePerPage){
            context+="==第"+posp+"页==";
            context+=Paper.newLine+Paper.newLine;
            posy=0;
            ++posp;
        }
    }

    @Override
    public String getContext() {
        String ret=context;
        if (!(posx==0 && posy==0)){
            int count=linePerPage - posy;
            for (int i = 0; i <count ; i++) {
                ret+=Paper.newLine;
            }
            ret="==第"+posp+"页==";
        }
        return ret;
    }
}
