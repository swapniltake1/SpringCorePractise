package com.springcore.constuctorinjection;

public class Person {

	private String PersonName;
	private int PersonId;
	private Certificate certificate;
	public Person(String personName, int personId, Certificate certificate) {
		PersonName = personName;
		PersonId = personId;
		this.certificate=certificate;
	}

	@Override
	public String toString() {
		
		return "PersonName = "+ this.PersonName+" PersonId= "+this.PersonId+" Certificate Name = "+this.certificate.name+" ";
	}
	
	
	
}
