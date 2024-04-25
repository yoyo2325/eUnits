package Lab06;

	//Name______________________________ Date_____________
   import edu.fcps.Turtle;
   import java.awt.Color;
   import javax.swing.*;
    public class Driver06
   {
       public static void main(String[] args)
      {
    	      JFrame frame = new JFrame("Square Turtles");
    	      frame.setSize(400, 400);
    	      frame.setLocation(200, 100);
    	      frame.setDefaultCloseOperation(3);
    	      frame.setContentPane(new TurtlePanel());
    	      frame.setVisible(true);
    	      SquareTurtle smidge = new SquareTurtle();
    	      SquareTurtle pete = new SquareTurtle(100.0D);
    	      SquareTurtle lisa = new SquareTurtle(600.0D, 200.0D, 135.0D);
    	      SquareTurtle mary = new SquareTurtle(100.0D, 300.0D, 45.0D, 25.0D);
    	      Turtle.setCrawl(false);
    	      smidge.setColor(Color.BLUE);
    	      lisa.setColor(Color.RED.darker());
    	      mary.setColor(Color.BLUE.brighter());
    	      smidge.setThickness(6);
    	      mary.setThickness(10);
    	      smidge.drawShape();
    	      pete.drawShape();
    	      lisa.drawShape();
    	      lisa.setSize(40.0D);
    	      lisa.drawShape();
    	      lisa.setSize(30.0D);
    	      lisa.drawShape();
    	      lisa.setSize(20.0D);
    	      lisa.drawShape();
    	      lisa.setSize(10.0D);
    	      lisa.drawShape();
    	      mary.drawShape();
    	      
      
      }
   }