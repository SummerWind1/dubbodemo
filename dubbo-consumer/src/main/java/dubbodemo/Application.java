package dubbodemo;

import com.radish.dubbodemo.service.HelloService;
import com.radish.dubbodemo.service.ZookeeperConnectService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Application {

    public static void main(String[] args) throws IOException {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-consumer.xml");

        context.start();

        HelloService helloService = (HelloService)context.getBean("helloService");
        System.out.println(helloService.helloWorld());

        ZookeeperConnectService zookeeperConnectService = (ZookeeperConnectService)context.getBean("zookeeperConnectService");
        zookeeperConnectService.connect();
        System.in.read();
    }

}
