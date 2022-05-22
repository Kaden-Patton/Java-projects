// Modified Grade assignment by Kaden Patton November 21st 2019

import java.util.Scanner;

public class clsGrades {

	public static String getLetterGrade(int grade)
	{
		if(grade >= 96 && grade <= 100)
			return "A+";
		else if(grade >= 92 && grade <= 95)
			return "A";
		else if(grade >= 90 && grade <= 91)
			return "A-";
		else if(grade >= 86 && grade <= 89)
			return"B+";
		else if(grade >= 82 && grade <= 85)
			return "B";
		else if(grade >= 80 && grade <= 81)
			return"B-";
		else if(grade >= 76 && grade <= 79)
			return "C+";
		else if(grade >= 72 && grade <= 75)
			return "C";
		else if(grade >= 70 && grade <= 71)
			return "C-";
		else if(grade >= 66 && grade <= 69)
			return "D+";
		else if(grade >= 62 && grade <= 65)
			return "D";
		else if(grade >= 60 && grade <= 61)
			return "D-";
		else if(grade >= 0 && grade <= 59)
			return "F"; 
		else
			return "[Error] Bad input: " + grade;
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int count = 0, total = 0, max = 0, min = 0;
		
		System.out.print("Enter the numeric grade [-1 to quit]: ");	
		int inputtedGrade = input.nextInt();

		while(inputtedGrade >= 0 && inputtedGrade <= 100) 
		{
			count++;
			total += inputtedGrade;
			if(inputtedGrade > max)
				max = inputtedGrade;
			
			if(inputtedGrade < min)
				min = inputtedGrade;
			
			System.out.print("Enter the numeric grade [-1 to quit]: ");	
			inputtedGrade = input.nextInt();
		}
		
		input.close();
		
		System.out.println("Maximum: " + getLetterGrade(max));	
		System.out.println("Minumum: " + getLetterGrade(min));	
		System.out.println("Average: " + getLetterGrade(total / count));	
		
	}

}
