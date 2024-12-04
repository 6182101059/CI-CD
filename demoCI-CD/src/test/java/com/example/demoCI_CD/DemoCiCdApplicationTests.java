package com.example.demoCI_CD;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoCiCdApplicationTests {

	@Test
	public void test1(){
		assertEquals(1, 1+ 0);
	}

	@Test
	public void test2(){
		assertEquals(2, 1 + 1);
	}

	@Test
	public void test3(){
		assertEquals(3, 2 + 1);
	}

}
