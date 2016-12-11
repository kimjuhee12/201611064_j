package com.sd.game;

public class DiceGame {
    private Player p1;
    private Player p2;
	public DiceGame(String name1, String name2) {
		p1 = new Player(name1);
        p2 = new Player(name2);
	}
	public void play() {
		p1.play(1);
		p2.play(1);
		//player class에서 switch문 받아와 실행
	}
	public Player getP1() {
		return p1;
	}
	public Player getP2() {
		return p2;
	}
	
	public String score() {
		int P1_point = p1.getNum();
		int P2_point = p2.getNum();
        if (P1_point > P2_point) {
            return "Winner is " + p1.getName();
        }
        else if (P1_point < P2_point) {
            return "Winner is " + p2.getName();
        } // 포인트 큰 플레이어 이름 리턴
        else
            return "draw";
		//무승부면 draw 출력
    }
}
