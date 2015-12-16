package org.mvnsearch.mybatis.domain.infrastructure.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.mvnsearch.mybatis.domain.model.City;

/**
 * city mapper
 *
 * @author linux_china
 */
public interface CityMapper {
    @Select("SELECT * FROM city WHERE STATE = #{state}")
    @ResultMap("CityResultMap")
    City findByState(@Param("state") String state);

    City selectCityById(Integer id);
}
