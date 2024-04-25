package Lab05;

    //Torbert, e-mail: smtorbert@fcps.edu	
	 //version 6.17.2003
	 //version 11.4.09  mlbillington@fcps.edu
   import javax.swing.*;
   import java.awt.*;
   import java.awt.event.*;
   import java.awt.image.*;
    public class BugPanel extends JPanel
   {
      private BufferedImage myImage;
      final int N = 400;
       public BugPanel()
      {
         myImage = new BufferedImage(N, N, BufferedImage.TYPE_INT_RGB);
         Graphics buffer = myImage.getGraphics();
         buffer.setColor(Color.BLUE);
         buffer.fillRect(0, 0, N, N);
         buffer.setColor(Color.YELLOW);
         Bug bug1=new Bug(0,0);
         Bug bug2=new Bug(400,0);
         Bug bug3=new Bug(400,400);
         Bug bug4=new Bug(0,400);
         buffer.drawLine(bug1.getX(),bug1.getY(),bug2.getX(),bug2.getY());
         buffer.drawLine(bug2.getX(),bug2.getY(),bug3.getX(),bug3.getY());
         buffer.drawLine(bug3.getX(),bug3.getY(),bug4.getX(),bug4.getY());
         buffer.drawLine(bug4.getX(),bug4.getY(),bug1.getX(),bug1.getY());
         while(!bug1.sameSpot(bug4)) {
        	 
        	 bug1.walkTowards(bug2, 0.1D);
             bug2.walkTowards(bug3, 0.1D);
             bug3.walkTowards(bug4, 0.1D);
             bug4.walkTowards(bug1, 0.1D);
             buffer.drawLine(bug1.getX(),bug1.getY(),bug2.getX(),bug2.getY());
             buffer.drawLine(bug2.getX(),bug2.getY(),bug3.getX(),bug3.getY());
             buffer.drawLine(bug3.getX(),bug3.getY(),bug4.getX(),bug4.getY());
             buffer.drawLine(bug4.getX(),bug4.getY(),bug1.getX(),bug1.getY());
             System.out.print(bug1.getX());
         }
        
         
      }
       public void paintComponent(Graphics g)
      {
         g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
      }
   }