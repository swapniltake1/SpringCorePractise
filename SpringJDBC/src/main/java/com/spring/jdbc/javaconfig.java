package com.spring.jdbc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.dao.StudentDaoImplement;

@Configuration
@ComponentScan(basePackages = {"com.spring.jdbc.dao"})  // only for autowirring
public class javaconfig {
    
	@Bean("ds")
	public DataSource getDataSource() {
		
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://127.0.0.1:3306/SpringJDBC");
		ds.setUsername("root");
		ds.setPassword("admin");
		
		return ds;	
	}
	
	@Bean("jdbcTemplate")
	public JdbcTemplate getTemplate() {
		
		JdbcTemplate jdbcTemplate=new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		
		return jdbcTemplate;
		
	}
	
	/*  for auttowirring desabled this one
	@Bean("StudentDao")
	public StudentDao getStudentDao() {
		
		StudentDaoImplement studentDao=new StudentDaoImplement();
		studentDao.setJdbcTemplate(getTemplate());
		return studentDao;
		
	}
	*/
}
