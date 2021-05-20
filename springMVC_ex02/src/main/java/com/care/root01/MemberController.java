package com.care.root01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
	@Autowired
	private MemberService ms;
	
	public MemberController() {
		System.out.println("===== memberController 생성자 ======");
	}
	@RequestMapping("insert")
	public String insert() {
		System.out.println("ms : " + ms);
		//ms = new MemberService();
		ms.insert();
		return "index";
	}
	
	
	
}




































