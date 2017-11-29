package org.mvnsearch.mybatis;

import org.dbunit.database.DatabaseConnection;
import org.dbunit.database.IDatabaseConnection;
import org.dbunit.dataset.xml.FlatDtdDataSet;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.io.FileOutputStream;

/**
 * database test
 *
 * @author leijuan
 */
public class DataBaseTest extends MyBatisBaseTest {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void testSpike() throws Exception {
        Assert.assertNotNull(jdbcTemplate);
    }

    @Test
    public void generateDTD() throws Exception {
        IDatabaseConnection connection = new DatabaseConnection(jdbcTemplate.getDataSource().getConnection());
        FlatDtdDataSet.write(connection.createDataSet(), new FileOutputStream("src/test/resources/db/dataset/database.dtd"));
    }
}
