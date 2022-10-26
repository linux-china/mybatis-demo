package org.mvnsearch.mybatis.controller;

import org.mvnsearch.mybatis.domain.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * portal controller
 *
 * @author linux_china
 */
@RestController
public class PortalController {
    @Autowired
    public CityRepository cityRepository;

    @RequestMapping(path = {"/", "/index"})
    public String index() {
        return "Hello " + cityRepository.findOne(1L).getName();
    }
}
