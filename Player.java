package com.sd.game;

class Player {
    private String name=null;
	private String yut = null;
    private int num=0;
	private static final int DICE = 1, YUT = 2;
    public Player(String name) {
        setName(name);
    }

	public void play(int fInt) {
		switch(fInt) {
		case DICE:
			Dice d = new Dice();
			num = d.roll();
			break;
		case YUT:
			Yut y = new Yut();
			num = y.roll();
			yut = y.getYut();
			break;
		default:
			break;
		}
		
	}
	//switch문으로 윷놀이와 주사위게임 경우 나누기
    public int getNum() {
        return this.num;    
	}
	public String getYut() {
		return this.yut;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}