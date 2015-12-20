package com.ddlab.rnd.app;

import com.ddlab.rnd.services.api.MyService;
import com.ddlab.rnd.services.impl.MyServiceImpl;

public class TestApp {
	
	private void checkService(MyService service) {
		String result = service.getName();
		System.out.println("Name from service :::"+result);
	}
	
	public void invokeService() {
		
		checkService( new MyServiceImpl());
	}

}
