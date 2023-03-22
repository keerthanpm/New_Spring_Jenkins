package com.example.jenins;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
class JeniknsEx1ApplicationTests {
	private static org.slf4j.Logger logger = LoggerFactory.getLogger(JeniknsEx1ApplicationTests.class);
	@Test
	void contextLoads() {
		assertEquals(true, true);
	}

}
