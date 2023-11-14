package com.abhi.springbootbasic.app.repository;

import com.abhi.springbootbasic.app.entity.QueryCreation;
import org.springframework.data.repository.Repository;

import java.util.List;

@org.springframework.stereotype.Repository
public interface QueryCreationRepository extends Repository<QueryCreation, Integer> {

    List<QueryCreation> findByEmailAddressAndLastname(String emailAddress, String lastname);
}
