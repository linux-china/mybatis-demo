package org.mvnsearch.mybatis.domain.model;


import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * city
 *
 * @author linux_china
 */
@Data
public class City implements Serializable {

    private Long id;

    private String name;

    private String state;

    private String country;

    private Date updatedAt;

    private Date createdAt;

}