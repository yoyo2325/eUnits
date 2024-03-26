import edu.fcps.Digit;
import edu.fcps.karel2.Display;

public class Lab11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display.openDefaultWorld();
		Display.setSize(36, 32);
		Display.setSpeed(10);
		
		Digit zero = new Zero(4,20);
		Digit one = new One(10,20);
		Digit two = new Two(16,20);
		Digit three = new Three(22,20);
		Digit four = new Four(28,20);
		Digit five = new Five(4,10);
		Digit six = new Six(10,10);
		Digit seven = new Seven(16,10);
		Digit eight = new Eight(22,10);
		Digit nine = new Nine(28,10);
		
		zero.display();
		one.display();
		two.display();
		three.display();
		four.display();
		five.display();
		six.display();
		seven.display();
		eight.display();
		nine.display();
		
	}

}
