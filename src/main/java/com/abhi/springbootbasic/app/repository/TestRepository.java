package com.abhi.springbootbasic.app.repository;

import com.abhi.springbootbasic.app.entity.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestRepository extends org.springframework.data.repository.Repository<Test, Integer> {
    List<Test> findByTest(String test);
}
