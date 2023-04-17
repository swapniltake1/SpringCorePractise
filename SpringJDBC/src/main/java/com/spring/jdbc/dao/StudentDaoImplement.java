package com.spring.jdbc.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.spring.jdbc.entity.Student;

@Component("StudentDao")
public class StudentDaoImplement implements StudentDao {
    @Autowired
	private JdbcTemplate jdbcTemplate;

	// getter and setter for jdbctemplete
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
    
	 
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	
	public int insert(Student student) {
		// Insert Query
		String queryString = "insert into student(id,name,address) values (?,?,?)";
	    
		int result=this.jdbcTemplate.update(queryString,student.getId(),student.getName(),student.getCity());
		
		return result;
	}

	public int Change(Student student) {
		// Updating data 
		
		String queryString="update student set name=?, address=? where id=?";
		
		int result = this.jdbcTemplate.update(queryString,student.getName(),student.getCity(), student.getId());
		
		return result;
	}

	public int delete(int studentId) {
		// Delete data
		
		String queryString="delete from student where id=?";
		int result = this.jdbcTemplate.update(queryString,studentId);
		return result;
	}

	public Student getStudent(int studentId) {
		// Selecting sigle student data 
		
		String queryString="select * from student where id=?";
		RowMapper<Student> Mapper=new rowMapper();
		Student student = this.jdbcTemplate.queryForObject(queryString, Mapper,studentId);
		return student;
	}

	public List<Student> getallStudents() {
		// Selecting all student 
		
		String queryString="select * from student";
		List<Student> student = this.jdbcTemplate.query(queryString, new rowMapper());
		return student;
	}

}
