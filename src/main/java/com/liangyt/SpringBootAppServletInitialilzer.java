package com.liangyt;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;

/**
 * 描述：Spring Boot提供的SpringBootServletInitializer是一个支持 Spring Boot的Spring WebApplicationInitializer实现。
 * 除了配置Spring的Dispatcher- Servlet,SpringBootServletInitializer
 * 还会在Spring应用程序上下文里查找Filter、 Servlet或ServletContextInitializer类型的Bean,把它们绑定到Servlet容器里
 *
 * @author tony
 * @创建时间 2017-08-16 10:28
 */
@Configuration
public class SpringBootAppServletInitialilzer extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(AppStarter.class);
    }
}
