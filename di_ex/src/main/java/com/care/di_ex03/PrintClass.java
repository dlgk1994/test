package com.care.di_ex03;

import java.util.ArrayList;
import java.util.HashMap;

public class PrintClass {
	
	public void print(String name, ArrayList hobby, HashMap weather) {
		System.out.println("name : " + name);
		System.out.println("취미 0 : " + hobby.get(0));
		System.out.println("취미 1 : " + hobby.get(1));
		System.out.println("날씨 : " + weather.get("오늘"));
		System.out.println("날씨 : " + weather.get("내일"));
		
	}
}
