package com.abhi.springbootbasic.app.service;

import com.abhi.springbootbasic.app.entity.Test;

import java.util.List;

public interface TestService {
    Test createTest(Test newTest);

    List<Test> findTestByTest(String test);

}
