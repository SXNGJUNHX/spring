package com.test.web.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
//@Qualifier("memo")
@Primary
public class MemoService implements DataService{
	
	@Override
	public void add(String message) {
		System.out.println("메모 : " + message);
		
	}

}
