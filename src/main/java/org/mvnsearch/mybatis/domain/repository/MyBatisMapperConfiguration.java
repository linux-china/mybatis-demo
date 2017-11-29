package org.mvnsearch.mybatis.domain.repository;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.mapper.MapperFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyBatisMapperConfiguration {
    @Bean
    public MapperFactoryBean<CityRepository> providerRepository(SqlSessionFactory sqlSessionFactory) {
        MapperFactoryBean<CityRepository> factoryBean = new MapperFactoryBean<>(CityRepository.class);
        factoryBean.setSqlSessionFactory(sqlSessionFactory);
        return factoryBean;
    }

}
