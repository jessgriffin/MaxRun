
/****************************************************************************
 *
 * Created by: Jess
 * Created on: Sept 2016
 * This program accepts a string and returns the max run in the string.
 ****************************************************************************/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaxRun {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.out.println("Input a string");
		
		String userInput;
		int currentRun = 1;
		int max = 1;
		
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		
		userInput = br.readLine();
		
		char [] userArray = userInput.toCharArray(); 
		// this loop and if statements run through the array
		// comparing each character to the one previous
		//to determine the maximum run in the string
		// and which character it is
		for (int x =1; x < userArray.length; x++) {
			
			if (userArray[x] == userArray[x-1]) {
				
				currentRun++;
				
			}
			if (currentRun > max) {
				
				max = currentRun;
					
			}
							
		}
		
		System.out.println("The longest run is " + max);
	}

}
