package com.sd.ch8;

public class Rectangle implements Shape {
	private double width;
	private doubleheight;
	private double area;
	private double perimeter;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
		this.area= width * height;
		this.perimeter = 2 * (width + height);
	}
	
	@Override
	public double calcArea() {
		return this.area;
	}
	
	@Override
	public double calcPerimeter() {
		return this.perimeter;
	}
}