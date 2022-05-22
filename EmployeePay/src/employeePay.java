// "Employee Pay" by Kaden Patton. October 13th

import java.util.Scanner;

public class employeePay {

	public static void main(String[] args) {
		
		// Doubles because hours sometimes aren't nice and neat integers
		double wage;
		double hours;
		double overtimeHours;
		
		double overtimePay;
		double weeklyPay;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your wage: $");
		wage = input.nextDouble();
		
		System.out.print("Enter hours worked: ");
		hours = input.nextDouble();
		
		System.out.print("Enter any overtime hours: ");
		overtimeHours = input.nextDouble();
		
		overtimePay = overtimeHours * (wage * 1.5);
		weeklyPay = (hours * wage) + overtimePay;
		
		System.out.println("This week you made $" + weeklyPay);
		

	}

}
