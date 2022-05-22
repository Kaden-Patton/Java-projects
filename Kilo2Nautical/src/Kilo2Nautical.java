import java.util.Scanner;

public class Kilo2Nautical {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		// ( x/50 ) * 27
		double kilo;
		double nautical;
		System.out.println("Today we're going to convert kilometers to nautical miles!");
		System.out.print("Enter kilometers: ");
		kilo = input.nextDouble();
		nautical = (kilo/50) * 27;
		System.out.print(kilo + " kilometers is " + nautical + " nautical miles.");
		input.close();
		
	}

}
