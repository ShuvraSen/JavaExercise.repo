package com.Excercises;

public class ReverseNumberInJava {

	public static void main(String[] args) {
		//reverse a number without builtin method in java
		int number=1234;
		int reverse=0;
		
		while(number!=0){
			int reminder=number%10;//get the last digit---1234%10=4
			reverse=reverse * 10 +reminder;//0*10+4=4
			number=number/10;//1234/10=123===eivabe 0 hoyar ag porjonto cholbe loop
		}
		System.out.println(reverse);
	}

}
