package org.mvnsearch.mybatis.domain.repository;

import com.github.database.rider.core.api.dataset.DataSet;
import org.junit.Assert;
import org.junit.Test;
import org.mvnsearch.mybatis.MyBatisBaseTest;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * city repository test
 *
 * @author linux_china
 */
public class CityRepositoryTest extends MyBatisBaseTest {
    @Autowired
    private CityRepository cityRepository;

    @Test
    @DataSet("/db/dataset/state.xml")
    public void testOne() {
        Assert.assertNotNull(cityRepository.findOne(1));
    }
}
