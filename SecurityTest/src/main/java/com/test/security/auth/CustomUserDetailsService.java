package com.test.security.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.test.security.dto.CustomUser;
import com.test.security.dto.MemberDTO;
import com.test.security.mapper.MemberMapper;

import lombok.RequiredArgsConstructor;


//@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService{
	
	@Autowired
	private MemberMapper mapper;
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		MemberDTO dto = mapper.read(username);
		
		return dto != null ? new CustomUser(dto) : null;
	}
	
}
