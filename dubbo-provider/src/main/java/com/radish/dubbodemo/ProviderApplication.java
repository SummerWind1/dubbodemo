package com.radish.dubbodemo;

import com.radish.dubbodemo.config.AnnotationDubboProviderConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class ProviderApplication {

    public static void main(String[] args) throws IOException {
        // 配置文件启动
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-provider.xml");
//
//        context.start();
//
//        System.in.read();


        // 注解方式启动
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        context.register(AnnotationDubboProviderConfig.class);

        context.refresh();

        context.start();

        System.out.println("启动成功");

        System.in.read();

    }

}
