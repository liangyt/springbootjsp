### Spring-boot 结合jsp
spring-boot 官方听说并不推荐使用jsp模板引擎，不适合打jar时直接运行，也不太适合运行嵌套jetty容器。  
但是以前的项目大部分是使用jsp的，所以就自已试一下，权当练手了。

也比较简单，以下是application.properties的配置
```$xslt
spring.mvc.view.prefix=/WEB-INF/views/
spring.mvc.view.suffix=.jsp

# 开启修改JSP文件，刷新页面可以看到新内容
server.jsp-servlet.init-parameters.development=true
```

只有两行配置了，后面那一行看注释就知道什么意思了。  
在引入包方面把容器跟jsp相应的组件引入：
```$xslt
<dependency>
    <groupId>javax.servlet</groupId>
    <artifactId>javax.servlet-api</artifactId>
    <scope>provided</scope>
</dependency>
<dependency>
    <groupId>javax.servlet</groupId>
    <artifactId>jstl</artifactId>
</dependency>

<dependency>
    <groupId>org.apache.tomcat.embed</groupId>
    <artifactId>tomcat-embed-jasper</artifactId>
</dependency>
```

代码方面，继承了WebMvcConfigurerAdapter写了一个配置类： 主要是重写了两个方法
```$xslt
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
```

其它就没有什么了。