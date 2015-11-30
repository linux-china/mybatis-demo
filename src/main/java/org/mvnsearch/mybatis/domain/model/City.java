package org.mvnsearch.mybatis.domain.model;


import java.io.Serializable;
import java.util.Date;

/**
 * city
 *
 * @author linux_china
 */
public class City implements Serializable {

    private Long id;

    private String name;

    private String state;

    private String country;

    private Date createdAt;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + this.id +
                ", name='" + this.name + '\'' +
                ", state='" + this.state + '\'' +
                ", country='" + this.country + '\'' +
                ", date='" + this.createdAt + '\'' +
                '}';
    }
}