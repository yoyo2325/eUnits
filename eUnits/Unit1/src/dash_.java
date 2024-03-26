import edu.fcps.Digit;

public class dash_ extends Digit implements Runnable{

	public dash_(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		segment1_Off();
		segment2_Off();
		segment3_Off();
		segment4_Off();
		segment5_Off();
		segment6_Off();
		segment7_On();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		display();
	}

}
