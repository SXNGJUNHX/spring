package com.test.java.dto;

import java.util.List;

import com.test.java.dto.AuthDTO;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
public class MemberDTO {

	private String memberid;
	private String memberpw;
	private String membername;
	private String enabled;
	private String email;
	private String gender;
	private String regdate;
	
	
	private List<AuthDTO> authlist;
	private String auth; //회원가입용 (1: 회원, 2: 관리자)
	
}
