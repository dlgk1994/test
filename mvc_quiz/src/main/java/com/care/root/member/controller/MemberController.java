package com.care.root.member.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.care.root.member.dto.MemberDTO;
import com.care.root.member.service.MemberService;

@Controller
public class MemberController {
	@Autowired
	MemberService ms;
	
	@GetMapping("/index")
	public String index() {
		
		return "index";
	}
	
	@GetMapping("list")
	public String list(Model model) {
		ArrayList<MemberDTO> ls = ms.list();
		model.addAttribute("list",ls);
		return "listView";
	}
	
	@GetMapping("saveView")
	public String saveView() {
		return "saveView";
	}
	
	@PostMapping("save")
	public String save(MemberDTO dto) {
		ms.save(dto);
		return "redirect:list";
	}
	
	@PostMapping("check")
	public String check(Model model,
			@RequestParam String id,
			@RequestParam String pwd,
			RedirectAttributes rs) {
		ms.check(model, id, pwd);
		rs.addFlashAttribute("model",model);
		return "redirect:index";
	}
	
	
}






























