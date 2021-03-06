package com.care.root.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.care.root.Service.MemberService;
import com.care.root.member.dto.MemberDTO;

@Controller
public class memberController {
	@Autowired
	MemberService ms;
	
	@GetMapping("index")
	public String index() {
		return "member/index";
		
	}
	
	@GetMapping("insertview")
	public String insertview() {
		return "member/insertview";
	}
	@PostMapping("insert")
	public String insert(MemberDTO dto) {
		ms.insertMember(dto);
		return "redirect:index";
	}
}





















