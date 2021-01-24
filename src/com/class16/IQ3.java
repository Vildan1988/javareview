package com.class16;

public class IQ3 {

	/*find out how many alpha characters present in
	 *  string
	 */
	public static void main(String[]args) {
		
	String str="Hello 6876868 *&^^, welcomegyggiugig!!!!";
	str=str.replaceAll("[^a-zA-Z]", "");
	
		System.out.println(str.length());
		
		
		
	}
}
