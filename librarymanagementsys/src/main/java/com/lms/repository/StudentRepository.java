package com.lms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lms.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

	List<Student> findByborrowedBookIsNotNull();

}
