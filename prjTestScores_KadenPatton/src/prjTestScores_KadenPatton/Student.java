// Test scores by Kaden Patton, October 26th

package prjTestScores_KadenPatton;

public class Student {
	private String studentName;
	private int scoreOne, scoreTwo, scoreThree;
	
	Student()
	{
		studentName = "";
		scoreOne = 0;
		scoreTwo = 0;
		scoreThree = 0;
	}

	public String toString() {
		String str;
		str = "Name:\t"+ studentName + "\n" +
			  "Score one:\t" + scoreOne + "\n" +
			  "Score two:\t" + scoreTwo + "\n" +
			  "Score three:\t" + scoreThree + "\n";
		
		return str;
	}
	
	public void setName(String name) {
		studentName = name;
	}
	
	public String getName() {
		return studentName;
	}
	
	public void setScore(int i, int score) {
		switch(i) {
		case 1:
			scoreOne = score;
			break;
		case 2:
			scoreTwo = score;
			break;
		case 3:
			scoreThree = score;
			break;
		}
			
		
	}
	
	public int getHighScore() {
		int highScore = scoreOne;
		if(highScore > scoreTwo) highScore = scoreTwo;
		if(highScore > scoreThree) highScore = scoreThree;
		return highScore;
	}
	
	public int getAverage()
	{
		int average;
		
		average = (int) Math.round((scoreOne + scoreTwo + scoreThree) / 3.0);
		
		return average;
	}
}
