package com.feiyu.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import java.util.Date;

@Data
@Table(name = "user")
public class User {
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    private String name;

    private String sex;

    private String address;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;
}
