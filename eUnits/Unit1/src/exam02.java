import edu.fcps.karel2.Display;

public class exam02 {
	public static void mazeEscape(Athlete args) {
		while(!args.nextToABeeper()) {
			
			if(args.leftIsClear()) {
				args.turnLeft();
				args.move();
			}
			else if(args.rightIsClear()&&!args.frontIsClear()) {
				args.turnRight();
			}
			else if(!args.rightIsClear()&&!args.frontIsClear()&&!args.leftIsClear()) {
				args.turnAround();
			}
			else {
				args.move();
			}
			
		}
	}
	public static void main(String[] args) {
		Display.openWorld("maps/school.map");
		Athlete a1 =new Athlete(1,1,1,50);
		mazeEscape(a1);
		a1.pickBeeper();
		a1.turnAround();
		a1.move();
		mazeEscape(a1);
		a1.turnAround();
		a1.move();
		a1.putBeeper();
		a1.move();
	}

}
