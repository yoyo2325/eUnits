package Lab00;

import javax.swing.JFrame;

public class Lab00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame=new JFrame("Lab00");
		frame.setSize(400,255);
		frame.setLocation(0,0);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new Panel00());
		frame.setVisible(true);
	}

}
