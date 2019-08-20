package org.mvnsearch.mybatis.controller;

import com.github.database.rider.core.api.dataset.DataSet;
import org.junit.jupiter.api.Test;
import org.mvnsearch.mybatis.MyBatisBaseTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * portal controller test
 *
 * @author linux_china
 */
@AutoConfigureMockMvc
public class PortalControllerTest extends MyBatisBaseTest {
    @Autowired
    private MockMvc mvc;

    @Test
    @DataSet("/db/dataset/state.xml")
    public void testIndexPage() throws Exception {
        this.mvc.perform(get("/index").accept(MediaType.ALL))
                .andExpect(status().isOk());
    }
}
