package com.Excercises;

public class ReverseString {

	public static void main(String[] args) {
		// Reverse a string
		String word="sagor";
		String reverseString="";
		for(int i= word.length() -1;i>=0;i--){
			reverseString += word.charAt(i);
			
		}
		System.out.println(reverseString);
	}

}
