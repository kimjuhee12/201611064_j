package com.sd.DiceGame;
import com.sd.DiceGame.*;

public class DiceGame {
    Player p1;
    Player p2;
    public void startplay() {
        Player p1 = new Player("P1");
        Player p2 = new Player("P2");
		p1.play();
		p2.play();
		int P1_point = p1.getNum();
		int P2_point = p2.getNum();
        if (P1_point > P2_point) {
            System.out.println(p1.getName() + " won, Congratulation!!");
        }
        else if (P1_point < P2_point) {
            System.out.println(p2.getName() + " won, Congratulation!!");
        }
        else
            System.out.println(" Oh, no...draw");
    }
	public static void main(String[] args) {
		DiceGame d = new DiceGame();
		d.startplay();
	}
}
