package com.zteict.entity;

import java.util.Date;


/**
 * @author Yangpeng
 */
public class User {
    private Long id;
    private Date time;

    public User() {
    }

    public User(Long id, Date time) {
        this.id = id;
        this.time = time;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
