// Array int assignment. Kaden Patton November 10th 2019
// After watching the zoom video I realize just how over complicated I made this… oops.
// Good practice for traversing arrays I suppose!

import java.util.Scanner;

public class clsArrayIntegers {
	public static void main(String[] args) {
	    int[] inputNumbers = new int[10];
	    int[] evenNumbers = new int[10];
	    int[] oddNumbers = new int[10];
	    int[] negativeNumbers = new int[10];
	    Scanner reader = new Scanner(System.in);

	    // Get 10 numbers into an array from the user
	    for(int i = 0; i < 10; i++)
	    {       
	        System.out.print("Please enter an integer: ");
	        int number = reader.nextInt();
	        inputNumbers[i] = number;
	    }
	    
	    reader.close();	 
	    
	    for(int i = 0; i < 3; i++)
	    {
	        int index = 0;

	        if(i == 0)
	        {
	           for(int number : inputNumbers)                                                                                                                                                                                                                                                                                                                                                                                                                
	            {
	                if(number % 2 == 0 && number > 0)
	                {
	                    evenNumbers[index] = number;
	                    index++;
	                }
	            }
	        }
	        else if(i == 1)
	        {
	            for(int number : inputNumbers) 
	            {
	                if(number % 2 != 0 && number > 0)
	                {
	                    oddNumbers[index] = number;
	                    index++;
	                }
	            }
	        }
	        else if(i == 2)
	        {
	            for(int number : inputNumbers)
	            {
	                if(number < 0)
	                {
	                    negativeNumbers[index] = number;
	                    index++;
	                }
	            }
	        }
	        
	    }
	        


	    System.out.print("Even numbers: ");
	    
	    for(int number : evenNumbers)
	    {
	        if(number != 0)
	        {
	            System.out.print(number + " ");
	        }
	        
	    }

	    
	    System.out.print("\nOdd numbers: ");
	    
	    for(int number : oddNumbers)
	    {
	        if(number != 0)
	        {
	            System.out.print(number + " ");
	        }
	        
	    }
	    
	    System.out.print("\nNegative numbers: ");
	    
	    for(int number : negativeNumbers)
	    {
	        if(number != 0)
	        {
	            System.out.print(number + " ");
	        }
	        
	    }

		}

}
