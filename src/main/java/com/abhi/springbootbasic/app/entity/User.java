package com.abhi.springbootbasic.app.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "USER_TBL")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USR_ID")
    private Integer id;

    @Column(name = "FIRST_NAME")
    private String firstname;

    @Column(name = "LAST_NAME")
    private String lastname;

    @Column(name = "EMAIL_ADDRESS")
    private String emailAddress;

}
