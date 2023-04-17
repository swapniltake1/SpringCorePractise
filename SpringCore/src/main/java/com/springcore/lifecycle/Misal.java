package com.springcore.lifecycle;

public class Misal {

	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Misal() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Misal [price=" + price + "]";
	}
	
	public void init() {
		System.out.println("init Method -- Bean Lifecycle using @xml config declaratio");
	}
	
	public void destroy() {
		System.out.println("destroy method -- Bean Lifecycle using @xml config declaration ");
	}
	
}
