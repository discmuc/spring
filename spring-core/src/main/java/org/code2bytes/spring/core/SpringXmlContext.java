package org.code2bytes.spring.core;

import org.code2bytes.spring.core.beans.HelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringXmlContext {

    public static void main(String[] args) {
        String path = "/META-INF/spring/main.xml";
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
                path);

        HelloService helloService = ctx.getBean(HelloService.class);
        helloService.hello("Hello Spring!");

        ctx.close();
    }
}
