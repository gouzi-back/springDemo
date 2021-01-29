import cn.printer.Printer;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther:haha
 * @Date:2021/1/29 - 01 - 29 13:06
 * @Description:PACKAGE_NAME
 * @Version: 1.0
 */
public class PrinterTest {
    @Test
    public void test(){
        ApplicationContext context= new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Printer printer =(Printer) context.getBean("printer");
        String con="张家港市，江苏省县级市，由苏州市代管，位于中国大陆东部，长江下游南岸，东南与常熟相连，南与苏州、无锡相邻，西与江阴接壤，北滨长江，与如皋、靖江隔江相望，总面积986.73平方千米，其中陆域面积777平方千米，水域面积195.67平方千米。 [1-2] \n" +
                "张家港市原名沙洲，1986年9月撤销沙洲县，以境内天然良港张家港命名设立张家港市。境内自然环境优越，拥有香山、暨阳湖、凤凰山、永联小镇等风景名胜。";

       printer.print(con);
    }
}
