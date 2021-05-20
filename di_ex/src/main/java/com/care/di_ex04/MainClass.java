package com.care.di_ex04;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		
		String path = "classpath:applicationCAR.xml";
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(path);
		Car car = ctx.getBean("car", Car.class);
		
		System.out.println("main이 실행됩니다");
		car.speed();
		
		SubClass sc = new SubClass();
		sc.subFunc();
	}
	
}
