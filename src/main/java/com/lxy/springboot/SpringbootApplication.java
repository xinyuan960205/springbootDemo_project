package com.lxy.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan("com.lxy.springboot.dao")
@EnableSwagger2
public class SpringbootApplication extends SpringBootServletInitializer {

    // 用来测试访问
    @RequestMapping("/")
    public String home() {
        return "hello 朋友";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }


    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        // TODO Auto-generated method stub
//        return super.configure(builder);
        return builder.sources(SpringbootApplication.class);
    }
}
