package org.mvnsearch.mybatis;

import org.dbunit.database.DatabaseConnection;
import org.dbunit.database.IDatabaseConnection;
import org.dbunit.dataset.xml.FlatDtdDataSet;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.sql.DataSource;
import java.io.FileOutputStream;

/**
 * database test
 *
 * @author leijuan
 */
public class DataBaseTest extends MyBatisBaseTest {
    @Autowired
    private DataSource dataSource;

    @Test
    public void testConnection() throws Exception {
        Assert.assertNotNull(dataSource);
    }

    @Test
    public void generateDTD() throws Exception {
        IDatabaseConnection connection = new DatabaseConnection(dataSource.getConnection());
        FlatDtdDataSet.write(connection.createDataSet(), new FileOutputStream("target/database.dtd"));
    }
}
