package com.simple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //빈으로 생성할 클래스
public class HomeController {
	
	@RequestMapping("/test/aaa")
	public String Home() {
		
		return "home";
	}
}
