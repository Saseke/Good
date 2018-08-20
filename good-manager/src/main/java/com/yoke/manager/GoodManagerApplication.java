package com.yoke.manager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication(scanBasePackages = "com.yoke.manager")
@MapperScan(basePackages = "com.yoke.manager.dao.mapper")
public class GoodManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(GoodManagerApplication.class, args);
    }
}
