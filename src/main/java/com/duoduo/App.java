package com.duoduo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

/**
 * Created by FOX_duo on 2017/9/18.
 * <p>
 * spring 事务 首先使用 @EnableTransactionManagement 注解
 * 在需要使用事务的方法上使用 @Transactional
 * 回滚只会对执行的时候进行回滚
 */
@SpringBootApplication
@EnableTransactionManagement
public class App extends SpringBootServletInitializer {


    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(App.class);
    }
}

/**
 * springboot默认支持logback
 * 在calsspath下放一个logback.xml,logback-spring.xml 文件
 *
 * spingboot默认的日子级别为info
 * logging.level.*=debug  * 可以指定包也可以指定类
 * 日子级别有：TRACE,DEBUG,INFO,WARN,ERROR,FATAL,OFF
 * off表示关闭日志输出
 *
 * logging.file  指定日志文件的名字
 * logging.path 指定日志文件的路径，默认名字为spring。log
 * 日志大小10M就会自动分割
 *
 */
