package com.care.root.member.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.care.root.member.dto.MemberDTO;

@Repository
public class MemberDAO {
	ArrayList<MemberDTO> db = new ArrayList<MemberDTO>();
	public ArrayList<MemberDTO> list(){
		
		return db;
	}
	
	public void save(MemberDTO dto) {
		db.add(dto);
	}
	
	public MemberDTO check(String id) {
		for(MemberDTO dto : db) {
			if(id.equals(dto.getId())) {
				return dto;
			}
		}
		return null;
	}
	
	
	
	
	
	
	
}






















