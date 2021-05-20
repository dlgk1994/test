package com.care.root;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	@RequestMapping(value="index")
	public String memberIndex() {
		System.out.println("index연결되었습니다");
		return "member/index";
	}
	@RequestMapping("logout")
	public String memberLogout(Model model) {
		model.addAttribute("test", "로그아웃되었습니다");
		return "member/logout";
	}
	
	@RequestMapping("login")
	public ModelAndView memberLogin() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("login", "로그인 페이지 입니다");
		mv.setViewName("member/login");
		return mv;
	}
}



























