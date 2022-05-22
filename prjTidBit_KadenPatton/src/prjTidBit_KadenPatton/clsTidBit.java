// Tidbit credit plan by Kaden Patton. November 3rd
package prjTidBit_KadenPatton;
import java.util.Scanner;

public class clsTidBit {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double purchasePrice;
		int monthNumber;
		double startBalance;
		double endingBalance;
		double interestThisMonth;
		double downPayment;
		double principle;
		double payment;
		
		System.out.print("Please enter you intial purchasing price: $");
		purchasePrice = input.nextDouble();
		
		input.close();
		
		downPayment = (purchasePrice * .10);
		payment = (purchasePrice - downPayment) * 0.05;
		startBalance = purchasePrice - downPayment;
		endingBalance = startBalance;
		
		monthNumber = 0;
		
		System.out.printf("%-8s%20s%20s%20s%13s%20s", "Month", "Balance Owed", "Interest to pay", "Principle to pay", "Payment", "Ending balance\n");
		
		while(startBalance > 0) {
			monthNumber += 1;
			interestThisMonth = (startBalance * 0.01);
			principle = payment - interestThisMonth;
			endingBalance -= payment;
			startBalance = endingBalance;
			
			System.out.println(String.format("%-8d%20.2f%20.2f%20.2f%13.2f%20.2f", monthNumber, startBalance, interestThisMonth, principle, payment, endingBalance));
		}
		
		
		
		
	}

}
