package arrays;

import java.util.Scanner;

public class RomNum {


	public static void main(String[] args) {
	
		char[] romNumbers = {'I', 'V', 'X', 'L', 'C', 'D', 'M' };
		int[] valRomNumbers = { 1, 5, 10, 50, 100, 500, 1000 };
	
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int sum = 0;
		System.out.println("Enter a roman number:");
		String input= scanner.nextLine();
	    char [] inputCharsArray = input.toCharArray();
	  
	    if (input.equalsIgnoreCase("quit")) {
	    	System.out.println("Exiting program!");
	    	System.exit(0);
	    }
	    
	    
		for (int i = 0; i < inputCharArray.length; i++)  {
	    	System.out.println(inputCharArray[i]);
	    for (int j=0; j < romNumbers[j]);
	    		System.out.println(romNumbers[j] + ": i = " + i + ":j = " + j);
                if (inputCharArray) [i] == romNumbers[j] {
                	System.out.println("True");
                sum += valRomNumbers[j]; 
                
                }
		}
		
	    }
		
	
          