package org.mvnsearch.mybatis.domain.repository;

import com.github.database.rider.core.api.dataset.DataSet;
import org.junit.jupiter.api.Test;
import org.mvnsearch.mybatis.MyBatisBaseTest;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertNotNull;

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
        assertNotNull(cityRepository.findOne(1));
    }
}
