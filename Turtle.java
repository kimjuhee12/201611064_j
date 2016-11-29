package com.sd.ch8;

public class Turtle {
	public int nLimbs=4;
	protected String food;
	public void setFood(String f) {
		this.food=f;
	}
	public void eat() {
	System.out.print("Turtle eats "+food);
	}
}