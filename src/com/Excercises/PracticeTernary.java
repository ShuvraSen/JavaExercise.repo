package com.Excercises;

public class PracticeTernary {

	public static void main(String[] args) {
		//larest of 2 number
		int a=20;
		int b=30;
		int c=40;
		int res =(a<b)? (a<c?a:c):(b<c?b:c) ;
		System.out.println(res);///compare between 3 number
//		int a=20;
//		int b=30;
//		int res =(a>b)? a:b ;
		
		
//		small number from n number of value?
		int array[]={2,40,3,0};
		int smallestNumber=array[0];
		for(int i=0;i<array.length;i++){
			if(array[i] < smallestNumber){
				smallestNumber=array[i];
			}
			
		}
		System.out.println(smallestNumber);

		
		
}
}