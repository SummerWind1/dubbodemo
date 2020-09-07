package com.radish.dubbodemo.service.impl;

import com.radish.dubbodemo.service.ZookeeperConnectService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class ZookeeperConnectServiceImpl implements ZookeeperConnectService {
    public void connect() {
        System.out.println("连接成功");
    }
}
