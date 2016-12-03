package com.sd.ch8;

public class Main_Shape {
	public static void main(String[] args) {
		Rectangle r = new Rectangle(3,4);
		System.out.println("Area is " + r.calcArea() + "\nPerimeter is " + r.calcPerimeter()
				+ "\n" + r.toString());
				
		Circle c = new Circle(5);
		System.out.println("area is " + c.calcArea() + "\nperimeter is " + c.calcPerimeter()
				+ "\n" + c.toString());
	}
}