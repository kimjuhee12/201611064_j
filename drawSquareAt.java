/classpath lib/aplu5.jar
import ch.aplu.turtle.*;
Turtle t1=new Turtle();

void drawSquareAt(int size, double x, double y){
	t1.home();
	t1.clear();
	t1.setpos(x,y);
	for(int i=0;i<4;i++) {
		t1.forward(size)
		t1.left(90)
	}
}

drawSquareAt(100, 0, 0)