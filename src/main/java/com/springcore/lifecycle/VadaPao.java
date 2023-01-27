package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class VadaPao {
   
	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public VadaPao() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "VadaPao [price=" + price + "]";
	}
	
	@PostConstruct
	public void init() {
		System.out.println("PostConstroct -- Bean Lifecycle using @annotations");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("PreDestroy annotation -- Bean Lifecycle using @annotations ");
	}
	
}
