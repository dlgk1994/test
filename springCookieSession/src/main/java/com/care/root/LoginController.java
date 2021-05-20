package com.care.root;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	@RequestMapping(value="login", method = RequestMethod.GET)
	public String login() {
		
		return "/login/login";
	}
	
	@PostMapping("chkUser")
	public String chkUser(HttpSession session, @RequestParam("id") String userId, @RequestParam("pwd") String userPwd) {
		String id = "1", pwd = "1", nickName="홍길동";
		if(id.equals(userId) && pwd.equals(userPwd)) {
			session.setAttribute("login", nickName);
			session.setAttribute("loginId", userId);
			return "login/main";
		}else {
			return "redirect:login";
		}
		
	}
	
	@GetMapping("logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "login/login";
	}
	
	
	
	
	
	
	
	
	
	
}






























