package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.db.DBManager;
import com.example.demo.vo.CartVo;

@RestController
public class CartController {

	@RequestMapping("/insertCart")
	public String insertCart(CartVo cv) {
		String str ="OK";
		DBManager.insertCart(cv);
		System.out.println("담기: " + str);
		System.out.println("장바구니에 담긴 상품번호: " + cv.getGno());
		return str;
	}
	
}
