package org.mvnsearch.mybatis.domain.repository;

import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.jetbrains.annotations.Nullable;
import org.mvnsearch.mybatis.domain.model.City;

import java.util.List;

/**
 * city repository
 *
 * @author linux_china
 */
public interface CityRepository {
  @Nullable
  City findOne(long id);

  @ResultMap("CityResultMap")
  @Select("select * from CITY where ID = #{id}")
  City findById(long id);

  List<City> findByCountry(String country);
}
