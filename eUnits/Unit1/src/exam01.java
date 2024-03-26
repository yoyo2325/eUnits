import edu.fcps.karel2.Display;

public class exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display.openDefaultWorld();
		Display.setSize(36, 32);
		Display.setSpeed(10);
		
		E zero = new E(4,20);
		E one = new E(10,20);
		dash_ two = new dash_(16,20);
		two three = new two(22,20);
		three four = new three(28,20);
		
		
		 Thread t1 = new Thread( zero );
         Thread t2 = new Thread( one );
         Thread t3 = new Thread( two );
         Thread t4 = new Thread( three );
         Thread t5 = new Thread( four );
         t1.start();
         t2.start();
         t3.start();
         t4.start();
         t5.start();
		
		
	}

}