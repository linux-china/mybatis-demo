package org.mvnsearch.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * mybatis web application
 *
 * @author linux_china
 */
@SpringBootApplication
@MapperScan("org.mvnsearch.mybatis.domain.infrastructure.mapper")
public class MyBatisWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyBatisWebApplication.class, args);
    }

}
