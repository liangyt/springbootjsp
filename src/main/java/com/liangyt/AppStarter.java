package com.liangyt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 描述：@SpringBootApplication开启了Spring的组件扫描和Spring Boot的自动配置功能。
 * 实际 上,@SpringBootApplication将三个有用的注解组合在了一起。
 * 1. Spring的@Configuration:标明该类使用Spring基于Java的配置。
 * 2. Spring的@ComponentScan:启用组件扫描,这样你写的Web控制器类和其他组件才能被 自动发现并注册为Spring应用程序上下文里的Bean。
 * 3. Spring Boot的@EnableAutoConfiguration: 这个不起眼的小注解也可以称为 @Abracadabra1,就是这一行配置开启了Spring Boot自动配置的魔力,让你不用再写成 篇的配置了。
 *
 * @author tony
 * @创建时间 2017-08-16 10:21
 */
@SpringBootApplication
public class AppStarter {
    public static void main(String[] args) {
        SpringApplication.run(AppStarter.class, args);
    }
}
