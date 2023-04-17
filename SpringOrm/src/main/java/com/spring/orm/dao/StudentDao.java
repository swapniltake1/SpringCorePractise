package com.spring.orm.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.spring.orm.entity.Student;

public class StudentDao {

	private HibernateTemplate hibernateTemplate;
	
	
	public StudentDao() {
		super();
		// TODO Auto-generated constructor stub
	}


	public StudentDao(HibernateTemplate hibernateTemplate) {
		super();
		this.hibernateTemplate = hibernateTemplate;
	}


	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}


	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	// To insert data
    @Transactional
	public int insert(Student student) {
		
	Integer i=	(Integer) this.hibernateTemplate.save(student);
		return i;
	}
    
    // To get single data 
	public Student getStudent(int studentId) {
		
		Student student = this.hibernateTemplate.get(Student.class, studentId);
		return student;
	}
	
	// To get all data
	public List<Student> getallStudents(){
		List<Student> loadAll = this.hibernateTemplate.loadAll(Student.class);
		return loadAll;
	}
	
	// TO delete
	@javax.transaction.Transactional
	public void deleteStudent(int studentId) {
		Student student = this.hibernateTemplate.get(Student.class, studentId);
		this.hibernateTemplate.delete(student);
		System.out.println("Deleted Succesfully ");
	}
	
	// For update
	@javax.transaction.Transactional
	public void updateStudent(Student student) {
		this.hibernateTemplate.update(student);
		System.out.println("Data UpdATED Succesfully ");
	}
	
}
