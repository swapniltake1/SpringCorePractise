package com.springcore.constuctorinjection;

public class Addition {

	private int A;
	private int B;
	
	public Addition(int a, int b) {
		super();
		A = a;
		B = b;
		System.out.println("Constructer : int, int");
	}
	
	public Addition(double a, double b) {
		super();
		A = (int) a;
		B = (int) b;
		System.out.println("Constructer : double, double");
	}
	
	public Addition(String a, String b) {
		super();
		A = Integer.parseInt(a);
		B = Integer.parseInt(b);
		System.out.println("Constructer : String, String");
	}
	
	public void doSum() {
		System.out.println("Value Of A=" + this.A);
		System.out.println("Value Of B=" + this.B);
		System.out.println("Sum is ="+(this.A +this.B ));
	}
	
}
