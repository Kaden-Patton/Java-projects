// AWTCounter by Kaden Patton October 20th

import java.awt.*;
import java.awt.event.*;

public class AWTCounter extends Frame implements ActionListener{
	private Label counterLabel;
	private TextField textField;
	private Button button;
	private int count = 0;
	
	public AWTCounter() {
		setLayout(new FlowLayout());
		
		counterLabel = new Label("Counter");
		add(counterLabel);
		
		textField = new TextField(count + "", 10);
		textField.setEditable(false);
		add(textField);
		
		button = new Button("Count");
		add(button);
		
		button.addActionListener(this);
		
		setTitle("AWT Counter");
		setSize(250, 100);
		
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
	AWTCounter app = new AWTCounter();
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		++count;
		textField.setText(count + "");
	}
	
}
