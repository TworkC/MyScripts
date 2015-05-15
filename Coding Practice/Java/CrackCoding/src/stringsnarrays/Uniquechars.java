package stringsnarrays;

import java.util.Scanner;

public class Uniquechars {

	public Uniquechars() {
		/*arraysnlists
		questions 1.1 how to see if a string has all unique chars
		uniquechar1 has a runtime of O(n^2) because it double checks all spots
		uniquechar2 has a runtime of O(n) because it only runs through once*/
	}
	
	public static boolean uniquechar1(String str){
		
		for (int i = 0; i < str.length();i++){
			char searchCh = str.charAt(i);//picks up character
			
			for (int j = i+1; j <str.length();j++){
				if (searchCh == str.charAt(j))//checks if picked up ch matches next spot in line
					return false;
				
			}//for inner loop to check against rest of string
		}//for outer loop to pick up character
		
		return true;
	}//uniquechar1()
	
	public static boolean uniquechar2(String str){
		boolean[] bucket = new boolean[256];//covers ascii values
		
		for (int i = 0; i < str.length(); i++){
			if (bucket[(int)(str.charAt(i))] == true)//checks if the array has been flipped on
				return false;
			bucket[(int)(str.charAt(i))] = true;//marks visited char
			
		}//for loop to run through string
		
		return true;
	}//uniquechar2()
	
	public static void testUniques(Scanner input){

        System.out.println("Input a string to check");
        String user = input.next();
        
        System.out.println("First method returns " + Uniquechars.uniquechar1(user));
        
        System.out.println("Second method returns " + Uniquechars.uniquechar2(user));

	}//testUniques

}
