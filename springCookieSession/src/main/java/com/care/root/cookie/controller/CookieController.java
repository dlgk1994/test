package com.care.root.cookie.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CookieController {
	
	@RequestMapping("cookie")
	public String myCookie(HttpServletResponse response,
							HttpServletRequest req,
			@CookieValue(value="myCookie", required = false) Cookie cook) {
		System.out.println("cookie : "+cook);
		
		Cookie cookie = new Cookie("myCookie", "쿠키생성");
		cookie.setMaxAge(5);
		//cookie.setMaxAge(0);
		response.addCookie(cookie);
		
		/*
		Cookie[] cook = req.getCookies();
		for(Cookie c: cook) {
			System.out.println("name : "+c.getName());
		}
		*/
		return "/cookie/cookie";
	}
	@RequestMapping("quiz_cookie")
	public String quizCookie(Model model, 
				@CookieValue(value="myCookie", required = false) Cookie cook) {
		if(cook != null) {
			model.addAttribute("cook",cook);
		}
		return "/cookie/quizCookie";
	}
	@RequestMapping("popup")
	public String popup() {
		return "/cookie/popup";
	}
	@GetMapping("cookieChk")
	public String cookieChk(HttpServletResponse res) {
		Cookie cookie = new Cookie("myCookie", "나의쿠키");
		cookie.setMaxAge(10);
		cookie.setPath("/");
		res.addCookie(cookie);
		return "/cookie/closeCookie";
	}
}






























