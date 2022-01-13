package com.itheima.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration  //让当前类可以被spring boot扫描到，并生成实例存到容器中
@Profile(value="dev")  //指定多环境配置类的标识
public class DevDBConnector implements DBConnector {
    @Override
    public void configure() {
        System.out.println("数据库配置环境--dev");
    }
}
