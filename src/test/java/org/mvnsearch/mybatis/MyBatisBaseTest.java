package org.mvnsearch.mybatis;

import org.unitils.UnitilsJUnit4;
import org.unitils.spring.annotation.SpringApplicationContext;

/**
 * mybatis base test
 *
 * @author linux_china
 */
@SpringApplicationContext({"/appContext-unit.xml"})
public abstract class MyBatisBaseTest extends UnitilsJUnit4 {

}
