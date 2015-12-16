package org.mvnsearch.mybatis.domain.infrastructure.mapper;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.mapper.MapperFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * album mapper factory bean, compatible with spring-boot-starter-mybatis
 *
 * @author linux_china
 */
@Component
public class CityMapperFactoryBean extends MapperFactoryBean<CityMapper> {

    @Autowired
    public CityMapperFactoryBean(SqlSessionFactory sqlSessionFactory) {
        setMapperInterface(CityMapper.class);
        setSqlSessionFactory(sqlSessionFactory);
    }


    public Class<CityMapper> getObjectType() {
        return CityMapper.class;
    }

}
