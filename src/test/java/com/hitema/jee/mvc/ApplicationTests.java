package com.hitema.jee.mvc;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

	private static final Logger log = LoggerFactory.getLogger(ApplicationTests.class);
	@Test
	@DisplayName("Test For GetAll Countries for demo")
	void testForGetAllCountriesForDemo() {
		log.info("<<<<<<<<<START testForGetAllCountriesForDemo >>>>>>>>>");
		

		log.info("<<<<<<<<<END   testForGetAllCountriesForDemo >>>>>>>>>");
	}
	@Test
	void contextLoads() {
	}

}
