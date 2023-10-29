package com.abhi.springbootbasic.app.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
class BasicControllerTest {
    @Autowired
    BasicController basicController;

    @Test
    public void sayHello() throws Exception {
        assertThat(basicController.sayHello()).isEqualTo("Hello World");
    }
}