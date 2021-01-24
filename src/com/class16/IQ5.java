package com.class16;

public class IQ5 {
	/*Write a java program to reverse String?
	 * Reverse a string word by word?
	 */

	public static void main(String[] args) {
		
	String given="Welcome to the Java class";
	

	
	/* to reverse String
	 * split();
	 * step1: split-->array of string
	 * step2: use for loop and use decrement to print values
	 */
	String reversed ="";	
	String []str=given.split("\\s");
	for (int j=str.length-1; j>=0; j--) {
	reversed = reversed + str[j] + " ";
	}
	System.out.println(reversed);		
		
	//String []	str =given.split ("\\s);
	//for (int j=str.length-1; j>=0; j--){
	//System.out.println(str[j]);}
	/////////////////////////////////////////////
	
	//Write a java program to reverse String?	
	//toCharArray();charAt();
	
		String given1="today is java class";
		char []charArray=given1.toCharArray();
		for (int i=charArray.length-1; i>=0; i--) {
			System.out.print(charArray[i]);
		}
	///////////////////////////////////////////////using charAt	method
		System.out.println();
		String given2="I love java";
		
		for(int i=given2.length()-1; i>=0; i--) {
			System.out.print(given2.charAt(i));
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
