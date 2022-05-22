// "Incoming Freshmen" by Kaden Patton. October 13th
import java.util.Scanner;

public class incomingFreshmen {

	public static void main(String[] args) {
		
		String lastName;
		String firstName;
		String classYear;
		String phoneNumber;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter last name: ");
		lastName = input.next();
		
		System.out.print("Enter first name: ");
		firstName = input.next();
		
		System.out.print("Enter class year: ");
		classYear = input.next();
		
		System.out.print("Enter phone number: ");
		phoneNumber = input.next();
		
		
		input.close();
		
		System.out.println( lastName + ", " + firstName);
		System.out.println("Class of " + classYear);
		System.out.println("Phone number: " + phoneNumber);
		
		
		
	}

}
