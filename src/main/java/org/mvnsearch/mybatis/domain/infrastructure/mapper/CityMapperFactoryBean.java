package org.mvnsearch.mybatis.domain.infrastructure.mapper;

import org.mybatis.spring.mapper.MapperFactoryBean;

/**
 * album mapper factory bean, compatible with spring-boot-starter-mybatis
 *
 * @author linux_china
 */
public class CityMapperFactoryBean extends MapperFactoryBean<CityMapper> {

    public CityMapperFactoryBean() {
        setMapperInterface(CityMapper.class);
    }


    public Class<CityMapper> getObjectType() {
        return CityMapper.class;
    }

}
