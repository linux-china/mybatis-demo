package org.mvnsearch.mybatis.domain.model;

/**
 * city repository
 *
 * @author linux_china
 */
public interface CityRepository {

    City findOne(long id);
}
