import edu.fcps.Digit;

public class two extends Digit implements Runnable{

	public two(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		segment1_On();
		segment2_On();
		segment3_Off();
		segment4_On();
		segment5_On();
		segment6_Off();
		segment7_On();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		display();
	}

}
