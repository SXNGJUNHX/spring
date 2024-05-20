package com.test.code.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.test.code.dto.CodeDTO;

import lombok.extern.log4j.Log4j2;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml" ,"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
@Log4j2
public class CodeDAOImplTest {

	@Autowired
	private CodeDAO dao;
	
	@Test
	public void testCreateDAO() {
		assertNotNull(dao);
	}
	
	@Test
	public void testAdd() {
		
		CodeDTO dto = new CodeDTO();
		dto.setSubject("h1태그문입니다.");
		dto.setCode("<h1></h1>");
		dto.setLanguage("html"); //java, sql, html
		
		int result = dao.add(dto);
		
		assertEquals(1, result);
		
	}
	
	@Test
	public void testList() {
		List<CodeDTO> list = dao.list();
		
		assertEquals(3, list.size());
		
		log.info(list);
	}
	
	@Test
	public void testGet() {
		CodeDTO dto = dao.view("1");
		
		assertNotNull(dto);
		
		log.info("DTO", dto);
	}
	
}








