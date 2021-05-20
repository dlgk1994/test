package com.care.root.get_post;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/my")
public class MyController {
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index() {
		return "/get_post/index";
	}
	
	@GetMapping("/result")
	public String getResult(HttpServletRequest request, Model model) {
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		System.out.println("name " + name);
		System.out.println("age : " + age);
		model.addAttribute("name", name);
		model.addAttribute("age",age);
		model.addAttribute("method",request.getMethod());
		return "get_post/result";
	}
	
	@PostMapping("/result")
	public String psotResult(HttpServletRequest request, Model model,
				@RequestParam String name,
				@RequestParam("age") String age) {
		model.addAttribute("name", name);
		model.addAttribute("age",age);
		model.addAttribute("method",request.getMethod());
		return "get_post/result";
	}
	
	@PostMapping("/object")
	public String object(Model model, MemberDTO dto) {
		model.addAttribute("name", dto.getName());
		model.addAttribute("age",dto.getAge());
		
		return "get_post/result";
	}
	
	
}
































