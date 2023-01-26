package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Lassi implements InitializingBean,DisposableBean  {

	public Lassi() {
		// TODO Auto-generated constructor stub
	}
	
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Lassi(double price) {
		super();
		this.price = price;
	}

	@Override
	public String toString() {
		return "Lassi [price=" + price + "]";
	}
    
	
	public void init() 
	{
		System.out.println("Hii am inside the init method :");
	}
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Hiii my work is complete byee  !! ");
		
	}

	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("hie this is afterPropertiesset method ");
	}
	
	

}
