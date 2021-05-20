package com.care.root;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.care.root.member.dto.MemberDTO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping("/redirect/index")
	public String index(){
		return "re/index";
	}
	@RequestMapping("/redirect/result")
	public String result(@RequestParam("id") String id, Model model,
			RedirectAttributes ra) {
		System.out.println("id : " + id);
		if(id.equals("abc1234")) {
			//model.addAttribute("result","로그인 성공");
			//ra.addFlashAttribute("result","로그인 성공");
			MemberDTO dto = new MemberDTO();
			dto.setId("나야");
			dto.setPwd("안녕");
			dto.setName("홍길동");
			ra.addFlashAttribute("result", dto);
			return "redirect:rsOK";
		}else {
			return "redirect:rsNO";
		}
		
	}
	
	@RequestMapping("/redirect/rsOK")
	public String rsOK() {
		return "re/rsOK";
	}
	
	@RequestMapping("/redirect/rsNO")
	public String rsNO() {
		return "re/rsNO";
	}
}















