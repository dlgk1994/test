package com.care.di_ex04;

import org.springframework.context.support.GenericXmlApplicationContext;

public class SubClass {
	public void subFunc() {
		String path = "classpath:applicationCAR.xml";
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(path);
		Car car = ctx.getBean("car", Car.class);
		System.out.println("subFunc이 실행됩니다");
		car.speed();
	}
}
