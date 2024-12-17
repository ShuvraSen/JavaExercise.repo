package com.Excercises;

public class MultiArray {

	public static void main(String[] args) {
		int a[][]={{4,5,7},{4,8,9}};
		
		//enhanced forloop 
		for(int arry[]:a){//a full array
			for(int c:arry){//arr[] hobe na karon eita ekhon 1d array
				System.out.println(c);
			}
		}

	}

}
