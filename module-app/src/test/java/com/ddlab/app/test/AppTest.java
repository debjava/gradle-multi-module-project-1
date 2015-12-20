package com.ddlab.app.test;

import com.ddlab.rnd.services.impl.MyServiceImpl;
import org.junit.Test;

public class AppTest {
	
	@Test
	public void test1() {
		
		String result = new MyServiceImpl().getName();
		System.out.println("Name from service :::"+result);
	}

}
