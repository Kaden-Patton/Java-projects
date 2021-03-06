// Therapist project by Kaden Patton December 3rd 2019

package prjTherapist_KadenPatton;

import java.util.Scanner;

public class TherapistView {

	private Therapist therapist = new Therapist();
	
	public TherapistView()
	{
		Scanner input = new Scanner(System.in);
		String userString;
		String therapistString;
		
		
		System.out.println("Hello, what problem can I help you with today?");
		
		while(true) 
		{
			System.out.print("Enter your response or Q to quit: ");
			userString = input.nextLine();
			if(userString.equalsIgnoreCase("Q"))
			{
				break;
			}
			
			therapistString = therapist.reply(userString);
			System.out.println("\n" + therapistString);
		}
		
		input.close();
	}
	
}
