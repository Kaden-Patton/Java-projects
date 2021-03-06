// Kaden Patton November 29th 2019

package prjGUITestScores_KadenPatton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TestScoreView extends JFrame {
	
	private TestScoreModel model;
	
	private JMenuItem newMI 		= new JMenuItem("New");
	private JMenuItem openMI		= new JMenuItem("Open");
	private JMenuItem saveMI		= new JMenuItem("Save");
	private JMenuItem addMI			= new JMenuItem("Add");
	private JMenuItem modifyMI		= new JMenuItem("Modify");
	private JMenuItem deleteMI		= new JMenuItem("Delete");
	private JMenuItem highScoreMI 	= new JMenuItem("Highest Score");
	private JMenuItem aveScoreMI	= new JMenuItem("Class Average");
	private JButton firstButton		= new JButton("<<");
	private JButton previousButton	= new JButton("<");
	private JButton nextButton		= new JButton(">");
	private JButton lastButton		= new JButton(">>");
	private JLabel nameLabel		= new JLabel("Name");
	private JLabel t1_Label			= new JLabel("Test 1");
	private JLabel t2_Label			= new JLabel("Test 2");
	private JLabel t3_Label			= new JLabel("Test 3");
	private JLabel averageLabel		= new JLabel("Average");
	private JLabel indexLabel		= new JLabel("Index");
	private JLabel countLabel		= new JLabel("Count");
	private JTextField nameField	= new JTextField("");
	private JTextField t1_Field		= new JTextField("0");
	private JTextField t2_Field		= new JTextField("0");
	private JTextField t3_Field		= new JTextField("0");
	private JTextField averageField	= new JTextField("0");
	private JTextField countField	= new JTextField("0");
	private JTextField indexField	= new JTextField("-1");
	
	
	public TestScoreView(TestScoreModel m)
	{
		model = m;
		
		// File menu
		JMenu fileMenu = new JMenu("File");
		fileMenu.add(newMI);
		fileMenu.add(openMI);
		fileMenu.add(saveMI);
		
		// Edit menu
		JMenu editMenu = new JMenu("Edit");
		editMenu.add(addMI);
		editMenu.add(modifyMI);
		editMenu.add(deleteMI);
		
		// Data menu
		JMenu dataMenu = new JMenu("Data");
		dataMenu.add(highScoreMI);
		dataMenu.add(aveScoreMI);
		
		// Menu bar
		JMenuBar bar = new JMenuBar();
		bar.add(fileMenu);
		bar.add(editMenu);
		bar.add(dataMenu);
		setJMenuBar(bar);
		bar.setVisible(true);
		
		
		
		averageField.setEditable(false);
		countField.setEditable(false);
		indexField.setEditable(false);
		averageField.setBackground(Color.white);
		countField.setBackground(Color.white);
		indexField.setBackground(Color.white);
		
		JPanel centerPanel = new JPanel(new GridLayout(5, 4, 10, 5));
		JPanel southPanel = new JPanel();
		Container container = getContentPane();
		container.add(centerPanel, BorderLayout.CENTER);
		container.add(southPanel, BorderLayout.SOUTH);
		
		centerPanel.add(nameLabel);
		centerPanel.add(nameField);
		centerPanel.add(countLabel);
		centerPanel.add(countField);
		
		centerPanel.add(t1_Label);
		centerPanel.add(t1_Field);
		centerPanel.add(indexLabel);
		centerPanel.add(indexField);
		
		centerPanel.add(t2_Label);
		centerPanel.add(t2_Field);
		centerPanel.add(new JLabel(""));
		centerPanel.add(new JLabel(""));
		
		centerPanel.add(t3_Label);
		centerPanel.add(t3_Field);
		centerPanel.add(new JLabel(""));
		centerPanel.add(new JLabel(""));
		
		centerPanel.add(averageLabel);
		centerPanel.add(averageField);
		centerPanel.add(new JLabel(""));
		centerPanel.add(new JLabel(""));
		
		southPanel.add(firstButton);
		southPanel.add(previousButton);
		southPanel.add(nextButton);
		southPanel.add(lastButton);
		
		addMI.addActionListener(new AddListener());
		modifyMI.addActionListener(new ModifyListener());
		deleteMI.addActionListener(new DeleteListener());
		highScoreMI.addActionListener(new HighScoreListener());
		aveScoreMI.addActionListener(new AverageScoreListener());
		previousButton.addActionListener(new PreviousListener());
		nextButton.addActionListener(new NextListener());
		firstButton.addActionListener(new FirstListener());
		lastButton.addActionListener(new LastListener());
		
		setTitle("Student Test Scores");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}
	
	private void displayInfo()
	{
		Student s = model.currentStudent();
		if(s == null)
		{
			nameField.setText("");
			t1_Field.setText("0");
			t2_Field.setText("0");
			t3_Field.setText("0");
			averageField.setText("0");
			countField.setText("0");
			indexField.setText("-1");
		}
		else
		{
			nameField.setText(s.getName());
			t1_Field.setText("" + s.getScore(1));
			t2_Field.setText("" + s.getScore(2));
			t3_Field.setText("" + s.getScore(3));
			averageField.setText("" + s.getAverage());
			countField.setText("" + model.size());
			indexField.setText("" + model.currentPosition());
		}
	}
	
	private Student getInfoFromScreen()
	{
		Student s = new Student(nameField.getText());
		s.setScore(1, Integer.parseInt(t1_Field.getText()));
		s.setScore(2, Integer.parseInt(t2_Field.getText()));
		s.setScore(3, Integer.parseInt(t3_Field.getText()));
		return s;
	}
	
	private class AddListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			Student s = getInfoFromScreen();
			String message = s.validateData();
			
			if(message != null)
			{
				JOptionPane.showMessageDialog(TestScoreView.this, message);
			}
			
			message = model.add(s);
			if(message != null)
			{
				JOptionPane.showMessageDialog(TestScoreView.this, message);
			}
			else
			{
				displayInfo();
			}
			
		}
	}
	
	private class ModifyListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(model.size() == 0)
			{
				JOptionPane.showMessageDialog(TestScoreView.this, "No student is available");
				return;
			}
			
			Student s = getInfoFromScreen();
			String message = s.validateData();
			
			if(message != null)
			{
				JOptionPane.showMessageDialog(TestScoreView.this, message);
			}
			else
			{
				displayInfo();
			}
			
			message= model.replace(s);
			
			if(message != null)
			{
				JOptionPane.showMessageDialog(TestScoreView.this, message);
			}
			else
			{
				displayInfo();
			}
		}
	
	}

	private class DeleteListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(model.size() == 0)
			{
				JOptionPane.showMessageDialog(TestScoreView.this, "No student is available");
				return;
			}
			
			String message = model.delete();
			if(message != null)
			{
				JOptionPane.showMessageDialog(TestScoreView.this, message);
			}
			else
			{
				displayInfo();
			}
		}
	}
	
	private class HighScoreListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(model.size() == 0)
			{
				JOptionPane.showMessageDialog(TestScoreView.this, "No student is available");
				return;
			}
		
			Student s = model.getHighScore();
			JOptionPane.showMessageDialog(TestScoreView.this, s.toString());
		}
	}
	
	private class AverageScoreListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			if(model.size() == 0)
			{
				JOptionPane.showMessageDialog(TestScoreView.this, "No student is available");
				return;
			}
			
			int ave = model.getClassAverage();
			JOptionPane.showMessageDialog(TestScoreView.this, "The average score is " + ave);
		}
	}
	
	
	private class PreviousListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			model.previous();
			displayInfo();
		}
	}
	
	private class NextListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			model.next();
			displayInfo();
		}
	}
	
	private class FirstListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			model.first();
			displayInfo();
		}
	}
	
	private class LastListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			model.last();
			displayInfo();
		}
	}
	
}