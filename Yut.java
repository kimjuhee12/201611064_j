package com.sd.game;

public class Yut extends Dice {
	
	private String yut = null;
	
	public int roll() {
		setNum((int) (Math.random() * 6) + 1);
		setYut();
		return getNum();
	}
	public void setYut() {
		if (getNum() == 1)
			yut = "Drop out";
		else if (getNum() == 2)
			yut = "Do";
		else if (getNum() == 3)
			yut = "Gae";
		else if (getNum() == 4)
			yut = "Gul";
		else if (getNum() == 5)
			yut = "Yut";
		else if (getNum() == 6)
			yut = "Mo";
	}
	
	public String getYut() {
		return this.yut;
	}
	
}