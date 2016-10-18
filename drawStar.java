/classpath lib/aplu5.jar
import ch.aplu.turtle.*;
Turtle t1=new Turtle();

void drawStar(int size){
	t1.home();
	t1.clear();
	for(int i=0;i<5;i++) {
		t1.left(90)
		t1.forward(size)
	}
}

drawStar(30)