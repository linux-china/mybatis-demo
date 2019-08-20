MyBatis Demo
============================================
Integration with mybatis-spring-boot-starter

### How to use?

*  Add MyBatis configuration in application.properties

```properties
mybatis.config-location = classpath:/mybatis-config.xml
```

* Add MyBatisMapperConfiguration to create mapper bean for domain Repository interface.

```
@Configuration
public class MyBatisMapperConfiguration {
    @Bean
    public MapperFactoryBean<CityRepository> providerRepository(SqlSessionFactory sqlSessionFactory) {
        MapperFactoryBean<CityRepository> factoryBean = new MapperFactoryBean<>(CityRepository.class);
        factoryBean.setSqlSessionFactory(sqlSessionFactory);
        return factoryBean;
    }

}
```

### Integration

* FlywayDB: Database Migrations made Easy https://flywaydb.org/
* DataBase Rider: https://database-rider.github.io/database-rider/  please refer DateTimeReplacer to datetime replace
* MyBatis integration with Spring Boot: https://github.com/mybatis/spring-boot-starter
* DbUnit: http://dbunit.sourceforge.net/