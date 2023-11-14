package com.abhi.springbootbasic.app.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "QUERY_CREATION")
@Data
public class QueryCreation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "QC_ID")
    private Integer id;

    @Column(name = "EMAIL_ADDRESS")
    private String emailAddress;

    @Column(name = "LAST_NAME")
    private String lastname;

    @Column(name = "FIRST_NAME")
    private String firstname;
}
