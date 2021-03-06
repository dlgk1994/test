package com.care.root;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.care.root.Service.MemberService;
import com.care.root.member.controller.memberController;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = {"classpath:testMember.xml"})
public class TestMember {
	@Autowired 
	memberController mc;
	@Autowired
	MemberService ms;
	
	
	@Test
	public void testIns() {
		System.out.println("---mc -> " + mc);
		assertNotNull(mc); // 객체 mc가 null이 아니면 성공 (즉, 객체가 만들어졌다는 뜻)
	}
	
	@Test
	public void testServiceIns() {
		assertNotNull(ms); // 객체 mc가 null이 아니면 성공 (즉, 객체가 만들어졌다는 뜻)
	}
	
}



























