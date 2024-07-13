import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class HelloComponent extends JComponent implements MouseMotionListener {
    String theMessage;
    int xPos = 125, yPos = 125;
    public HelloComponent(String message){
        theMessage = message;
        addMouseMotionListener(this);

    }
   public void paintComponent(Graphics g) {
       g.drawString("Hello World", xPos, yPos);
   }
   public void mouseDragged(MouseEvent e) {
    xPos = e.getX();
    yPos = e.getY();
    repaint();
   }
   public void mouseMoved(MouseEvent e) {}
}
