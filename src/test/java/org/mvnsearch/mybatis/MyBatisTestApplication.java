package org.mvnsearch.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

/**
 * mybatis test application
 *
 * @author linux_china
 */
@SpringBootApplication
@PropertySource("/application.properties")
@MapperScan("org.mvnsearch.mybatis.domain.infrastructure.mapper")
public class MyBatisTestApplication {

}
