package org.mvnsearch.mybatis.domain.repository;

import org.jetbrains.annotations.Nullable;
import org.mvnsearch.mybatis.domain.model.City;

/**
 * city repository
 *
 * @author linux_china
 */
public interface CityRepository {
    @Nullable
    City findOne(long id);
}
