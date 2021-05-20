package com.care.root.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.care.root.member.dao.MemberDAO;
import com.care.root.member.dto.MemberDTO;

@Service
public class MemberServiceImpl implements MemberService{
	@Autowired
	MemberDAO mapper;
	@Override
	public void insertMember(MemberDTO dto) {
		mapper.insertMamber(dto);
		
	}

}
































