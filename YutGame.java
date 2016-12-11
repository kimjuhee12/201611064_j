package com.sd.game;

public class YutGame extends DiceGame {
	public YutGame(String name1,String name2) {
		super(name1, name2);
	}
	
	public void play() {
		getP1().play(2);
		getP2().play(2);
		
		int num1 = getP1().getNum();
		int num2 = getP2().getNum();
	
	}
}