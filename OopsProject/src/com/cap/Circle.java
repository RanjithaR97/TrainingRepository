package com.cap;

public class Circle {
	double pi=3.14;
	Square sq;
	
	double area(int r) {
		sq=new Square();
		int rsquare=sq.square(r);
		return pi*rsquare;
		
	}

}
