// Test scores by Kaden Patton, October 26th

package prjTestScores_KadenPatton;

import java.util.Scanner;

public class StudentApp {
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		Student firstStudent = new Student();
		Student secondStudent = new Student();
		
		String name;
		int score;
		
		System.out.print("Enter the student's first name: ");
		name = input.nextLine();
		firstStudent.setName(name);
		
		for(int i = 1; i <= 3; i++) {
		System.out.print("Enter the student's score: ");
		score = input.nextInt();
		firstStudent.setScore(i, score);
		}
		
		input.nextLine();
		
		System.out.print("Enter the student's first name: ");
		name = input.nextLine();
		
		secondStudent.setName(name);
		
		for(int i = 1; i <= 3; i++) {
		System.out.print("Enter the student's score: ");
		score = input.nextInt();
		secondStudent.setScore(i, score);
		}
		
		input.close();
		
		System.out.println(firstStudent);
		System.out.println(secondStudent);
		
		if(firstStudent.getHighScore() > secondStudent.getHighScore()) {
			name = firstStudent.getName();
			score = firstStudent.getHighScore();
		} else {
			name = secondStudent.getName();
			score = secondStudent.getHighScore();
		}
		
		System.out.println(name + " has the highest score, " + score);
		
		
		if(firstStudent.getAverage() > secondStudent.getAverage())
		{
			name = firstStudent.getName();
			score = firstStudent.getAverage();
		} else {
			name = secondStudent.getName();
			score = secondStudent.getAverage();
		}
	
		System.out.println(name + " has the better average, " + score);
		
	}
}
