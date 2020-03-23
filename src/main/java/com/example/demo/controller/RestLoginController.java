package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestLoginController {

														// 글자로 응답할거라는 것
	@RequestMapping(value = "/ActionWithData", produces = "text/plaine;charset=UTF-8")
	public String actionWithData(String name, int age) {
		String str ="";
		System.out.println("Ajax 통신임");
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		 str="<h2>로그인 함</h2>";
		return str;
	}
	
}
