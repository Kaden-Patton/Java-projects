// "Income tax calculator" by Kaden Patton. October 13th
import java.util.Scanner;

public class incomeTaxCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double TAX_RATE = 0.2;
		final double STANDARD_DEDUCTION = 10000.0;
		final double DEPENDENT_DEDUCTION = 2000.0;
		
		Scanner input = new Scanner(System.in);
		
		double grossIncome;
		int numberDependents;
		double taxableIncome;
		double incomeTax;
		
		System.out.print("Enter your gross income: ");
		grossIncome = input.nextDouble();
		
		System.out.print("Enter the number of dependents: ");
		numberDependents = input.nextInt();
		
		input.close();
		
		taxableIncome = grossIncome - STANDARD_DEDUCTION - DEPENDENT_DEDUCTION * numberDependents;
		incomeTax = taxableIncome * TAX_RATE;
		
		System.out.println("Your income tax is $" + incomeTax);
		
		
	}

}
