package com.care.root01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
	@Autowired
	@Qualifier("mmddmmdd")
	private MemberDAO dao;
	
	public MemberService() {
		System.out.println("==============service 생성자 실행===========");
	}
	
	public void insert() {
		//dao  = new MemberDAO();
		dao.insert();
	}
}
