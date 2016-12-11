package com.sd.game;

public class Yut extends Dice {
	
	private String yut = null;
	
	public int roll() {
		setNum((int) (Math.random() * 6) + 1);
		// 0을 제외한 6개의 숫자 랜덤
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
		// 주사위에서 사용한 Num을 '도 개 걸 윷 모 낙'으로 
	}
	
	public String getYut() {
		return this.yut;
	}
	
}