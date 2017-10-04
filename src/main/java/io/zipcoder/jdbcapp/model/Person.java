package io.zipcoder.jdbcapp.model;

import java.util.Date;

/**
 * Here's where your person object is defined.  Remember, we're not doing any JPA stuff here, so there shouldn't be
 * any annotations.  This is just a POJO (Plain Old Java Object) that represents our person.
 */
public class Person {
    private Integer id;
    private String firstName;
    private String lastName;
    private String mobile;
    private Date birthday;
    private Integer homeId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getHomeId() {
        return homeId;
    }

    public void setHomeId(Integer homeId) {
        this.homeId = homeId;
    }
}
