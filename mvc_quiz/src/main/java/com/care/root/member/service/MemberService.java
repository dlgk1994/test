package com.care.root.member.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.care.root.member.dao.MemberDAO;
import com.care.root.member.dto.MemberDTO;

@Service
public class MemberService {
	@Autowired
	MemberDAO dao;
	
	public ArrayList<MemberDTO> list() {
		ArrayList<MemberDTO> list01 = dao.list();
		
		return list01;
	}
	
	public void save(MemberDTO dto) {
		dao.save(dto);
	}
	public void check(Model model, String id, String pwd) {
		MemberDTO dto = dao.check(id);
		int result = 0;
		if(dto != null) {
			if(pwd.equals(dto.getPwd())) {
				result = 0;
				model.addAttribute("userName", dto.getName());
			}else {
				result = 1;
			}
		}else {
			result = -1;
		}
		model.addAttribute("login", result);
	}
	
	
}
























