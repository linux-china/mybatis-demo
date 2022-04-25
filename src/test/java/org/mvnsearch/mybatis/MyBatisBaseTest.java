package org.mvnsearch.mybatis;

import com.github.database.rider.core.api.configuration.DBUnit;
import com.github.database.rider.spring.api.DBRider;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

/**
 * mybatis base test
 *
 * @author linux_china
 */
@SpringBootTest
@DBRider
@DBUnit(cacheConnection = false, leakHunter = true)
@ActiveProfiles("test")
public abstract class MyBatisBaseTest {
}
