package com.sd.ch8;

public class Circle extends Point {
	private double radius;
	
	public Circle(int x, int y, double r) {
		super(x,y);
		this.radius=r;
	}
	
	public double getRadius() {
		return this.radius;
		
	}public double getArea() {
		return radius * radius * Math.PI;	
	}
	
	public static void main(String[] args) {
		Circle myCircle = new Circle(10,10,5);
		Double myArea = myCircle.getArea();
		System.out.print("Area is " + myArea);
	}
}
