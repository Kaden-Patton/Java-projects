// Drawing assignment by Kaden Patton. November 9th

package prjDrawingProject;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Example2 extends JPanel {
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    this.setBackground(Color.BLACK);
    
    g.setColor(new Color(248, 104, 44));
    g.fillRect(25, 25, 100, 100);
    g.setColor(new Color(145, 195, 0));
    g.fillRect(125, 25, 100, 100);
    g.setColor(new Color(0, 180, 241));
    g.fillRect(25, 125, 100, 100);
    g.setColor(new Color(255, 195, 0));
    g.fillRect(125, 125, 100, 100);
    
    g.setColor(Color.WHITE);
    g.drawString("Windows!", 100, 250);
    
  }
}
