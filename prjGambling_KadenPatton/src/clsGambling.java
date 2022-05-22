// The folly of gambling by Kaden Patton. October 20th
import java.util.Random;
import java.util.Scanner;

public class clsGambling {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		
		double currentMoney = 0;
		double initialMoney = 0;
		int currentCount = 0;
		int maximumCount = 0;
		int winCount = 0;
		
		System.out.print("Enter how much you want to wager: $");
		initialMoney = input.nextDouble();
		input.close();
		
		currentMoney = initialMoney;
		
		double maximumMoney = currentMoney;
		

		while(currentMoney > 0)
		{
			currentCount += 1;
			int diceRoll = random.nextInt(13);
			
			if(diceRoll == 7)
			{
				currentMoney += 4;
				winCount += 1;
			} else {
				currentMoney -= 1;
			}
			
			if(currentMoney >= maximumMoney)
			{
				maximumMoney = currentMoney;
				maximumCount = currentCount;
			}
			
			
		}
		
		
		int rollsOver = currentCount - maximumCount;
		
		System.out.println("You rolled " + currentCount + " times and won " + winCount + " times!");
		
		if(maximumMoney == initialMoney)
		{
			System.out.println("You never broke even.");
		} else
		{
			System.out.println("You should have stopped when you had $" + maximumMoney + " after " + maximumCount + " rolls, or " + rollsOver + " rolls ago.");
		}
		
		
		System.out.print("Unfortunately all your money is now mine, maybe come back and play again!");
		}
		
		
		
	}
	
