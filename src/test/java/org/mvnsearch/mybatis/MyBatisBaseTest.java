package org.mvnsearch.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.unitils.UnitilsJUnit4;
import org.unitils.spring.annotation.SpringApplicationContext;

/**
 * mybatis base test
 *
 * @author linux_china
 */
@SpringApplicationContext({"/appContext-unit.xml"})
@MapperScan("org.mvnsearch.mybatis.domain.infrastructure.mapper")
public abstract class MyBatisBaseTest extends UnitilsJUnit4 {

}
