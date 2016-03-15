MyBatis Demo
============================================
Integration with spring-boot-starter-mybatis

### modification

* Fixed https://github.com/mybatis/spring/issues/58 by custom mapper factorybean


### How to use?

*  Add in application.properties

```properties
mybatis.config= classpath:/mybatis-config.xml

```
* Add @MapperScan for Spring Boot Application

```
@SpringBootApplication
@MapperScan("org.mvnsearch.mybatis.domain.infrastructure.mapper")
public class MyBatisWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyBatisWebApplication.class, args);
    }

}
```

### Integration

* Unitils 3.4.3