package com.abhi.springbootbasic.app.serviceImpl;

import com.abhi.springbootbasic.app.entity.Test;
import com.abhi.springbootbasic.app.repository.TestRepository;
import com.abhi.springbootbasic.app.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    private final TestRepository testRepository;

    @Autowired
    public TestServiceImpl(TestRepository testRepository){
        this.testRepository = testRepository;
    }

    @Override
    public Test createTest(Test newTest) {
        return testRepository.save(newTest);
    }

}
