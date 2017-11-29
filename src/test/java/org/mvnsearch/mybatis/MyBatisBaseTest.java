package org.mvnsearch.mybatis;

import com.github.database.rider.core.DBUnitRule;
import org.junit.Rule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;

/**
 * mybatis base test
 *
 * @author linux_china
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public abstract class MyBatisBaseTest {
    @Autowired
    private DataSource dataSource;

    @Rule
    public DBUnitRule dbUnitRule = DBUnitRule.instance(() -> dataSource.getConnection());
}
