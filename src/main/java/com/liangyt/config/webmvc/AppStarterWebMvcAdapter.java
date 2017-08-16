package com.liangyt.config.webmvc;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 描述：
 *
 * @author tony
 * @创建时间 2017-08-16 11:13
 */
@Configuration
public class AppStarterWebMvcAdapter extends WebMvcConfigurerAdapter {

    /**
     * 添加新的访问静态资源
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // 访问路径为 /mystatic/其它资源
        registry.addResourceHandler("/mystatic/**").addResourceLocations("classpath:/mystatic/");
        super.addResourceHandlers(registry);
    }

    /**
     * 直接访问jsp
     * @param registry
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/hello").setViewName("/hello");
        super.addViewControllers(registry);
    }
}
