import ch.aplu.turtle.*;

public class MakeSwirlSquare{
	
	public static void main(String[] args) {
		new MakeSwirlSquare().makeSwirlSquare(5, 15, 20, 90.0);
	}

	Turtle t1=new Turtle();

	void makeSwirlSquare(int size, int bigger, int turns, double degree) {
		for(int i=0;i<turns;i++) {
			if(i%2 !=0) {
				size+=bigger;
				t1.forward(size);
				t1.right(degree);
			}
		}
	}

}