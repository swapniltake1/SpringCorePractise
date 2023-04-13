package com.springcore.springExpressionLanguage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("demo")
public class Demo {
     
	@Value("#{ 22+11 }")
	private int x;
	
	@Value("#{1+56}")
	private int y;
	@Value("#{ T(java.lang.Math).sqrt(25) }")
	private double z;
	
	@Value("#{ new java.lang.String('Swapnil')}")
	private String nameString;
	@Value("#{8>3}")
	private boolean isActive;
	
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", nameString=" + nameString + ", isActive=" + isActive + "]";
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	
	
	
}
