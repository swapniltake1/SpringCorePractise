package com.springcore.steriotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("ob")
//@Scope("prototype")
public class Student {
  
	@Value("Swapnil Take")
 private String studentname;
	@Value("Pune")
 private String studentcity;
	@Value("#{list}")
	private List<String>addressList;
 
 
public List<String> getAddressList() {
		return addressList;
	}
	public void setAddressList(List<String> addressList) {
		this.addressList = addressList;
	}
public String getStudentname() {
	return studentname;
}
public void setStudentname(String studentname) {
	this.studentname = studentname;
}
public String getStudentcity() {
	return studentcity;
}
public void setStudentcity(String studentcity) {
	this.studentcity = studentcity;
}

@Override
public String toString() {
	return "Student [studentname=" + studentname + ", studentcity=" + studentcity + "]";
}


 
}
