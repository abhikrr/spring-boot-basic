package com.abhi.springbootbasic;

import com.abhi.springbootbasic.app.controller.BasicController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootBasicApplicationTests {

	@Autowired
	private BasicController basicController;


	@Test
	public void testBasicController() {

		System.out.println("Test Application");
	}

}
