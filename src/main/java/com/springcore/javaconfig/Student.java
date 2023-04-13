package com.springcore.javaconfig;



// @Component  // we can use this also 
public class Student {
   
 String string="hiiiiiiii This is student class ";
 
 private Samosa samosa;
 
 public Samosa getSamosa() {
	return samosa;
}
public void setSamosa(Samosa samosa) {
	this.samosa = samosa;
}


public Student(Samosa samosa) {
	super();
	this.samosa = samosa;
}
public Student(String string, Samosa samosa) {
	super();
	this.string = string;
	this.samosa = samosa;
}
public void name() {
	
}void study() {
	// TODO Auto-generated method stub
  this.samosa.Display();
	 System.out.println(string);
}
	
	
}
