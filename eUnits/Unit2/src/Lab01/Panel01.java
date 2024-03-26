package Lab01;

 import javax.swing.*;
 import java.awt.*;
 public class Panel01 extends JPanel
 {
  public void paintComponent(Graphics g){
   g.setColor(Color.BLACK);
   g.fillRect(150, 275, 50, 75);
   g.drawRect(100, 200, 150, 150);
   int xPoints[]= {75,175,275};
   int yPoints[]= {200,150,200};
   g.drawPolygon(xPoints,yPoints,3);
  }
 }
