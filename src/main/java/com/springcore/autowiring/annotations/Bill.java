package com.springcore.autowiring.annotations;

import org.springframework.beans.factory.annotation.Autowired;

public class Bill {
  @Autowired
  private Hotel hotel;

public Bill() {
	super();
	// TODO Auto-generated constructor stub
}

public Bill(Hotel hotel) {
	super();
	this.hotel = hotel;
}

public Hotel getHotel() {
	return hotel;
}

public void setHotel(Hotel hotel) {
	this.hotel = hotel;
}

@Override
public String toString() {
	return "Bill [hotel=" + hotel + "]";
}
  
  
}
