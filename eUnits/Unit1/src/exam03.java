import edu.fcps.karel2.Display;

public class exam03 {
	public static void go1(Athlete args) {
		while(args.getY()!=1) {
			if(args.rightIsClear()) {
				args.turnRight();
				args.move();
			}
			else if(args.leftIsClear()&&!args.frontIsClear()) {
				args.turnLeft();
			}
			else if(!args.rightIsClear()&&!args.frontIsClear()&&!args.leftIsClear()) {
				args.turnAround();
			}
			else {
				args.move();
			}
			
		}
		args.turnRight();
		while(args.frontIsClear()) {
			args.move();
		}
	}
	
	public static void mop(Athlete args) {
		
		while(args.frontIsClear()) {
			while(args.nextToABeeper()) {
				args.pickBeeper();
			}
			args.move();
		}
		while(args.nextToABeeper()) {
			args.pickBeeper();
		}
		
	}
	
	public static void goUp(Athlete args) {
		
		if(args.facingEast()) {
			args.turnAround();
			while(!args.rightIsClear()) {
				args.move();
			}
			args.turnRight();
			args.move();
			args.turnRight();
			while(args.frontIsClear()) {
				args.move();
			}
			args.turnAround();
			
		}
		else if(args.facingWest()){
			args.turnAround();
			while(!args.leftIsClear()) {
				args.move();
			}
			args.turnLeft();
			args.move();
			args.turnLeft();
			while(args.frontIsClear()) {
				args.move();
			}
			args.turnAround();
			
		}
	}
	public static void main(String[] args) {
		Display.openWorld("maps/mop.map");
		Display.setSpeed(10);
		Athlete a1 =new Athlete(1,1,4,50);
		for(int i=0;i<9;++i) {
			mop(a1);
			goUp(a1);
		}
		mop(a1);
		go1(a1);
		
		
	}

}
