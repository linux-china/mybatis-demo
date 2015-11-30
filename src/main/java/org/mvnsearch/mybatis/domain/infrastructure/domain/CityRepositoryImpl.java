package org.mvnsearch.mybatis.domain.infrastructure.domain;

import org.mvnsearch.mybatis.domain.infrastructure.mapper.CityMapper;
import org.mvnsearch.mybatis.domain.model.City;
import org.mvnsearch.mybatis.domain.model.CityRepository;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * city repository implementation
 *
 * @author linux_china
 */
@Repository
public class CityRepositoryImpl implements CityRepository {
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;
    @Autowired
    private CityMapper cityMapper;

    public City findOne(long id) {
        return this.sqlSessionTemplate.selectOne("selectCityById", id);
    }
}
