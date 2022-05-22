package prjGUIWindow_KadenPatton;

import javax.swing.*;
import java.awt.*;

public class clsGUIWindow {

	public static void main(String[] args) {
		
		
		JFrame jFrame = new JFrame();
		
		jFrame.setTitle("Kaden's GUI Program!");
		jFrame.setSize(500, 500);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel blackPanel = new JPanel();
		JPanel redPanel = new JPanel();
		JPanel bluePanel = new JPanel();
		JPanel greenPanel = new JPanel();
		
		blackPanel.setBackground(Color.black);
		redPanel.setBackground(Color.red);
		bluePanel.setBackground(Color.blue);
		greenPanel.setBackground(Color.green);
		
		
		Container container = jFrame.getContentPane();
		container.setLayout(new GridLayout(2,2));
		
		container.add(blackPanel);
		container.add(redPanel);
		container.add(bluePanel);
		container.add(greenPanel);
		
		jFrame.setVisible(true);
	}

}
