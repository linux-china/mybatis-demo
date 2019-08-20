package org.mvnsearch.mybatis;

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
@ActiveProfiles("test")
public abstract class MyBatisBaseTest {
}
