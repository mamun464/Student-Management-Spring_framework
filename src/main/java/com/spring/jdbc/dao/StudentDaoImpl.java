package com.spring.jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.entites.Student;

public class StudentDaoImpl implements StudentDao{
	JdbcTemplate template;
	public int insert(Student std) {
		
		String Q="insert into student(id,name,city) value(?,?,?)";
		int result=template.update(Q,std.getId(),std.getName(),std.getCity());
		return result;
	}
	public JdbcTemplate getTemplate() {
		return template;
	}
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	
	

}
