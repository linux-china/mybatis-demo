package org.mvnsearch.mybatis;

import org.junit.Assert;
import org.junit.Test;
import org.unitils.UnitilsJUnit4;
import org.unitils.database.annotations.TestDataSource;
import org.unitils.dbunit.annotation.DataSet;

import javax.sql.DataSource;

/**
 * unitils check test
 *
 * @author linux_china
 */
@DataSet({"/database/dataset/state.xml"})
public class UnitilsCheckTest extends UnitilsJUnit4 {

    @TestDataSource
    private DataSource dataSource;

    @Test
    public void testCheckUnitils() {
        Assert.assertNotNull(dataSource);
        System.out.println(dataSource.getClass());
    }
}
