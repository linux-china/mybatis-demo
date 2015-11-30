package org.mvnsearch.mybatis.controller;

import org.mvnsearch.mybatis.domain.model.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * portal controller
 *
 * @author linux_china
 */
@Controller
public class PortalController {
    @Autowired
    public CityRepository cityRepository;

    @RequestMapping("/")
    @ResponseBody
    public String index() {
        return "Hello " + cityRepository.findOne(1L).getName();
    }
}
