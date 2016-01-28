package HelloWorldPack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by bionix on 28.01.2016.
 */
public class HelloWorldSpring {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("META-INF/spring/app-context.xml");
        MessageRender mr = ctx.getBean("renderer",MessageRender.class);
        mr.render();
        MessageRender mrNew = ctx.getBean("renderNew", MessageRender.class);
        mrNew.render();
    }
}
