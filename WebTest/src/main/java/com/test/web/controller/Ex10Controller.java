package com.test.web.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.test.web.service.DataService;

import lombok.RequiredArgsConstructor;

/*
	스프링 의존 주입
	1. 필드 주입, Field Injection
	2. Setter 주입
	3. 생성자 주입	 > *** 가장 권장
*/

@Controller
@RequiredArgsConstructor
public class Ex10Controller {
	
	//private final BoardService service;
	//@Qualifier("memo")
	private final DataService service;
	
//	@Autowired
//	private BoardService service;
	
//	@Autowired
//	public void setService(BoardService service) {
//		this.service = service;
//	}
	
//	@Autowired
//	public Ex10Controller(BoardService service) {
//		this.service = service;
//	}

	@GetMapping(value="/addBoard.do")
	public String add(String message) {
		
		//BoardService service = new BoardService();
		
		service.add(message);
		
		return "ex10";
	}

}













