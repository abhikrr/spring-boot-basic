package com.abhi.springbootbasic.app.repository;

import com.abhi.springbootbasic.app.entity.Test;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepository extends CrudRepository<Test, Integer> {
}
