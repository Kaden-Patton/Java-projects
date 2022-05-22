// Test draw by Kaden Patton. October 20th
import java.awt.*;
import javax.swing.*;


public class clsTestDraw extends JFrame {
private ImageIcon image;
private JLabel label;

 clsTestDraw()
{
	setLayout(new FlowLayout());
	image = new ImageIcon(getClass().getResource("smokey.jpg"));
	label = new JLabel(image);
	add(label);
}


public static void main(String[] args) {
	clsTestDraw gui = new clsTestDraw();
	gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	gui.setVisible(true);
	gui.pack();
	
}

}
