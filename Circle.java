package com.sd.ch8;

public class Circle extends Shape {
    private double radius;
	private double area;
	private double perimeter;

    public Circle(double radius) {
        this.radius = radius;
        this.area = Math.PI * radius * radius;
        this.perimeter = 2 * Math.PI * radius;
    }
	
    @Override
    public double calcArea() {
        return this.area;
    }
	
    @Override
    public double calcPerimeter() {
        return this.perimeter;
    }
    public String toString() {
        return "Circle... "+super.toString();
    }
}

