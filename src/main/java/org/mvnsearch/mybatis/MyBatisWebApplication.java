package org.mvnsearch.mybatis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * mybatis web application
 *
 * @author linux_china
 */
@SpringBootApplication
@ImportResource("/appContext-mybatis.xml")
public class MyBatisWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyBatisWebApplication.class, args);
    }

}
