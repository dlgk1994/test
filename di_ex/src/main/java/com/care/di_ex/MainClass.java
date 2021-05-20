package com.care.di_ex;

public class MainClass {
	public static void main(String[] args) {
		
		STBean st = new STBean();
		
		st.setSt(new Student());
		st.setName("홍길동");
		st.setAge(20);
		
		st.namePrint();
		st.agePrint();
	}
}
