package com.care.root.session.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SessionConteoller {
	@RequestMapping("set")
	public String setSession(HttpServletRequest request, Model model) {
		HttpSession session = request.getSession();
		
		session.setAttribute("id", "홍길동");
		session.setAttribute("age", "20");
		
		//model.addAttribute("id","model홍길동");
		//model.addAttribute("age","model20살");
		return "/session/setSession";
	}
	
	@GetMapping("resultSession")
	public String resultSession() {
		
		return "/session/resultSession";
	}
	@GetMapping("delSession")
	public String delSession(HttpSession session) {
		session.removeAttribute("id");
		//session.invalidate();
		return "/session/delSession";
	}
	
}
































