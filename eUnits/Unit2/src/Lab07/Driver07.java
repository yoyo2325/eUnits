package Lab07;

	//Name______________________________ Date_____________
   import edu.fcps.Turtle;
   import java.awt.Color;
   import javax.swing.*;

import Lab06.SquareTurtle;
   public class Driver07
   {
      public static void main(String[] args)
      {
         JFrame frame = new JFrame("Polygon Turtles");
         frame.setSize(400, 400);
         frame.setLocation(200, 100);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setContentPane(new TurtlePanel());
         frame.setVisible(true);
      
         PolygonTurtle smidge = new PolygonTurtle(50,50,6,3,3);
         PolygonTurtle pete = new PolygonTurtle(50,60,70,4,4);
         PolygonTurtle lisa = new PolygonTurtle(600.0D, 200.0D, 135.0D,5,5);
         PolygonTurtle mary = new PolygonTurtle(100.0D, 300.0D, 45.0D, 25.0D,3);
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