package com.test.java.mapper;

import java.util.List;

import org.springframework.stereotype.Controller;

import com.test.java.dto.BoardDTO;

@Controller
public interface BoardMapper {

	List<BoardDTO> list();
	
	int add(BoardDTO dto);
	
	BoardDTO view(String seq);
	
	int edit(BoardDTO dto);
	
	int del(String seq);
	
}
