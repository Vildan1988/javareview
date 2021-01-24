package com.class16;

public class IQ6 {

	/*Write a java program to find whether a string is palindrome or not?
	 * if reversed string and original string are same -->string is palindrome
	 * mom,dad,racecar,kayak,bob
	 * Logic:
	 * Step1:reverse the string
	 * step2: compare 2 string:
	 *     if string are equal-->palindrome
	 *     else-->not palindrome 
	 * 
	 */
	
	public static void main(String[] args) {
		
		String original="kayak";
		String reversed="";
		
		for (int i=original.length()-1; i>=0; i--) {
			reversed=reversed+original.charAt(i);
			
		}
		System.out.println(reversed);
		
		 if (original.contentEquals(reversed)) {
			 System.out.println("String is palindrome");
		 }else {
			 System.out.println("String is not palindrome");
		 }
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
