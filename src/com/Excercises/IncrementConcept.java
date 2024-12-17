package com.Excercises;

public class IncrementConcept {

	public static void main(String[] args) {
		int a=10;
		System.out.println(a++);
		System.out.println(a);
		int b=11;
		System.out.println(++b);
		System.out.println(b);
		
//		ternary op
		int c=100;int d=200;
		//int x=(c-d)? 300:-100;----error
		//In Java, the condition for the ternary
		//operator must always be a boolean expression (true or false).
		//Arithmetic expressions (like c - d) cannot be used directly 
		//unless explicitly compared to form a boolean condition.
		 String res=(c>d)? "is not true":"true";
		System.out.println(res);
		if(false){
			System.out.println(1);
		}else{
			System.out.println(2);
		}
	}

}
