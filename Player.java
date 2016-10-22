package com.sd.DiceGame;
import com.sd.DiceGame.*;

class Player {
    private String name=null;
    private int num=0;
    public Player(String name) {
        this.name=name;
    }
	public String getName() {
		return name;
	}
    public void play() {
        Dice d = new Dice();
        d.roll();
        this.num=d.getNum();
    }
    public int getNum() {
        return this.num;    
	}
	public static void main(String[] args) {
		System.out.println("Player");
	}
}
