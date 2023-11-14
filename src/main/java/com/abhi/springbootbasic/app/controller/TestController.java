package com.abhi.springbootbasic.app.controller;

import com.abhi.springbootbasic.app.entity.Test;
import com.abhi.springbootbasic.app.service.TestService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TestController {

    private final TestService testService;

    public TestController(TestService testService){
        this.testService = testService;
    }

    @PostMapping("tests")
    public ResponseEntity<Test> createTest(@RequestBody Test newTest){
        try {
            Test createTest = testService.createTest(newTest);
            return new ResponseEntity<>(createTest, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/tests/{test}")
    public List<Test> getTestByName(@PathVariable String test){
        return testService.findTestByTest(test);
    }

}
