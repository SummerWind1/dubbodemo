package com.radish.dubbodemo.service.impl;

import com.radish.dubbodemo.service.HelloService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService(timeout = 100000)
public class HelloServiceImpl implements HelloService {
    public String helloWorld() {
        return "Hello Dubbo World";
    }
}
