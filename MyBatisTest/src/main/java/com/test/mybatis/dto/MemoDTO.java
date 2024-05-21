package com.test.mybatis.dto;

import lombok.Getter;
import lombok.ToString;
import lombok.Setter;

@Getter
@Setter
@ToString
public class MemoDTO {

	private String seq;
	private String memo;
	private String regdate;
	private String aseq; // FK(tblAddress)
	
}
