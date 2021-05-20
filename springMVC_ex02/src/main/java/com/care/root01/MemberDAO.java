package com.care.root01;

import org.springframework.stereotype.Repository;

@Repository("mmddmmdd")
public class MemberDAO {
	
	public MemberDAO() {
		System.out.println("=========dao 생성자 실행=============");
	}
	
	public void insert() {
		System.out.println("DB 추가했습니다");
	}
}
