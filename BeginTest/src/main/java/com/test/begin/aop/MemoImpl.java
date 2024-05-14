package com.test.begin.aop;

import java.util.Calendar;

public class MemoImpl {

	
	
	public void add(String memo) {
		System.out.println("메모 쓰기: " + memo);
		
		//로그 기록
		//Calendar now = Calendar.getInstance();
		//System.out.printf("[LOG]%tF %tF > 메모 쓰기가 발생했습니다.\n", now, now);
		
		//Logger logger = new Logger();
		//logger.log("메모 쓰기가 발생했습니다.");
	}
	
	public void addSecret(String memo) {
		System.out.println("비밀 메모를 작성합니다.");
	}
	
	
	public String read(int seq) throws Exception {
		if(seq != 10) {
			System.out.println("메모 읽기: " + seq);
			//Calendar now = Calendar.getInstance();
			//System.out.printf("[LOG]%tF %tF > 메모 읽기가 발생했습니다.\n", now, now);
			return "메모입니다.";
		} else {				
			throw new Exception("존재하지 않는 메모입니다.");
		}
	}
	
	
	public boolean edit(int seq, String memo) {
		System.out.println("메모 수정: " + memo);
		//Calendar now = Calendar.getInstance();
		//System.out.printf("[LOG]%tF %tF > 메모를 수정했습니다.\n", now, now);
		return true;
	}
	
	
	public boolean del(int seq) {
		System.out.println("메모 삭제: " + seq);
		//Calendar now = Calendar.getInstance();
		//System.out.printf("[LOG]%tF %tF > 메모를 삭제했습니다.\n", now, now);
		return true;
	}
	
}
