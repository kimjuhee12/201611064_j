/classpath lib/aplu5.jar
import ch.aplu.turtle.*;
Turtle t1=new Turtle();

void drawSquare(int size){
	t1.home();
	t1.clear();
	for(int i=0;i<4;i++) {
		t1.forward(size)
		t1.left(90)
	}
}
drawSquare(100)
