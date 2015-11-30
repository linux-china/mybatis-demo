package org.mvnsearch.mybatis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mvnsearch.mybatis.domain.infrastructure.mapper.CityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.unitils.dbunit.annotation.DataSet;
import org.unitils.spring.annotation.SpringBeanByType;

/**
 * mybatis web application tests
 *
 * @author linux_china
 */
@DataSet({"/database/dataset/state.xml"})
public class MybatisWebApplicationTests extends MyBatisBaseTest {
    @SpringBeanByType
    CityMapper cityMapper;

    @Test
    public void contextLoads() {
        System.out.println(cityMapper.findByState("CA").getCountry());
    }

}
