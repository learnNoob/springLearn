package com.noob.service.Impl;


import com.noob.service.WelcomeService;
import org.springframework.stereotype.Component;


@Component
public class WelcomeServiceImpl implements WelcomeService {
	@Override
	public String sayHello(String name) {
		System.out.println(name);
		return "name";
	}

	public void rr(){
		System.out.println("1234567");
	}
}
