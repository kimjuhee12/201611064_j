class RockScissorPaper{
	String sel1, sel2;
	
	public RockScissorPaper(String sel1, String sel2) {
		this.sel1 = sel1;
		this.sel2 = sel2;
		
		rspPlay(sel1, sel2);
	}
	
	public void rspPlay(String sel1, String sel2) {
		if (sel1.equals("scissor")) {
			if (sel2.equals("rock"))
				System.out.println("sel2 won");
			else if (sel2.equals("paper"))
				System.out.println("sel1 won");
			else
				System.out.println("oh, draw!");
		}
		else if (sel1.equals("rock")) {
			if (sel2.equals("paper"))
				System.out.println("sel2 won");
			else if (sel2.equals("scissor"))
				System.out.println("sel1 won");
			else
				System.out.println("oh, draw!");
		}
		else {
			if (sel2.equals("scissor"))
				System.out.println("sel2 won");
			else if (sel2.equals("rock"))
				System.out.println("sel1 won");
			else
				System.out.println("oh, draw!");
		}
	}
	
	public static void main(String[] args) {
		String sel1 = "scissor";
		String sel2 = "rock";
		
		System.out.println("sel1 = " + sel1 + ", sel2 = " + sel2);
		RockScissorPaper rps = new RockScissorPaper(sel1, sel2);
	}
}