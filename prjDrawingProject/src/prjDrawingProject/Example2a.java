// Drawing assignment by Kaden Patton. November 9th

package prjDrawingProject;

import javax.swing.*;

public class Example2a {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Kaden's super cool frame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Example2 p = new Example2();
		
		frame.add(p);
		frame.setSize(300, 300);
		frame.setVisible(true);

	}

}
