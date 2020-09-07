package com.radish.dubbodemo.config;

import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ProtocolConfig;
import org.apache.dubbo.config.ProviderConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableDubbo(scanBasePackages = "com.radish.dubbodemo.service.impl")
public class AnnotationDubboProviderConfig {

    /**
     * 应用配置 相当于 <dubbo:application name = "xxx"></dubbo:application>
     * @return
     */
    @Bean
    public ApplicationConfig applicationConfig() {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("annotation-provider");
        return applicationConfig;
    }

    /**
     * 协议配置 相当于<dubbo:protocol name = "dubbo" port = "20880"></dubbo:protocol>
     * @return
     */
    @Bean
    public ProtocolConfig protocolConfig() {
        ProtocolConfig protocolConfig = new ProtocolConfig();
        // 可以抽成配置类
        protocolConfig.setPort(20880);
        protocolConfig.setName("dubbo");
        return protocolConfig;
    }

    /**
     *
     * @return
     */
    @Bean
    public RegistryConfig registryConfig() {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress("zookeeper://172.18.3.66:2182");
        registryConfig.setTimeout(20000);
//        registryConfig.setClient("zkclient");
        return registryConfig;
    }

    @Bean
    public ProviderConfig providerConfig() {
        return new ProviderConfig();
    }

}
