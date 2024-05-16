package com.test.web.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.test.web.dto.AddressDTO;

@Controller
public class Ex06Controller {

	@GetMapping(value="/add.do")
	public String add() {
		
		return "add"; 
	}
	
	/*
	@PostMapping(value="/addok.do")
	public String addok(HttpServletRequest req) throws UnsupportedEncodingException {
		
		//req.setCharacterEncoding("UTF-8");		
		String num = req.getParameter("num");
		
		//ModelAndView mv;
		
		req.setAttribute("num", num);
		
		return "addok";
	}
	*/
	
	//스프링에서는 요청 메소드에게 넘어오는 대부분의 데이터를 매개 변수 형태로 받는다.
	/*
	@PostMapping("/addok.do")
	public String addok(@RequestParam("num") int num){
		
		System.out.println(num);
		
		return "addok";
	}
	*/
	
	/*
	@PostMapping("/addok.do")
	public String addok(String num, Model model){
		
		//ModelAndView
		model.addAttribute("num", num);
		
		return "addok";
	}
	*/
	
	
//	@PostMapping("/addok.do")
//	public String addok(Model model, @RequestParam("name") String name, @RequestParam("age") String age, @RequestParam("address") String address){
	/*
	@PostMapping("/addok.do")
	public String addok(Model model, String name, int age, String address){	
	
		//가장 많이 하는 행동? > DTO담기
		AddressDTO dto = new AddressDTO();
		
		dto.setName(name);
		dto.setAge(age);
		dto.setAddress(address);
		
//		model.addAttribute("name", name);
//		model.addAttribute("age", age);
//		model.addAttribute("address", address);
		
		model.addAttribute("dto", dto);
		
		return "addok";
	}
	*/
	
	
	@PostMapping("/addok.do")
	public String addok(Model model, AddressDTO dto, @RequestParam(defaultValue = "100") int id){	
	
		//1. req.getParameter()
		//2. DTD 생성
		
		System.out.println(dto);
		//System.out.println(id);
		
		model.addAttribute("dto", dto);
		
		return "addok";
	}
	
	
	/*
	@PostMapping("/addok.do")
	public String addok(Model model
			//, String cb
			//, @RequestParam("cb") String[] cb
			//, @RequestParam("cb") List<String> cb
			, @RequestParam("cb") ArrayList<String> cb
			//, ArrayList<String> cb
			//, String[] cb
			//, List<String> cb
			){	
		
		System.out.println(cb);
		
		return "addok";
	}
	*/
	
	
	/*
	@PostMapping("/addok.do")
	public String addok(Model model, @ModelAttribute("num") String num) {
		
		//@ModelAttribute
		//- 모델 객체에 데이터를 추가하지 않아도 자동으로 추가된다.
		
		return "addok";
	}
	*/
}





































