package com.Excercises;

public class Practice {
	public static int binarySearchIndex(int array[],int targetValue){
		int leftDigit=0;
		int rightDighit=array.length-1;
		while(leftDigit<=rightDighit){
			int mid=leftDigit + (rightDighit-leftDigit)/2;
			if(array[mid]==targetValue){
				return mid;
			}
			if(array[mid]<targetValue){
				leftDigit=mid+1;
			}else{
				rightDighit=mid-1;
			}
			
			
		}
		return -1;
	}

	public static void main(String[] args) {
		int array[]={2,45,52,65,77,82,95};
		int targetIndex=2;
		int result=binarySearchIndex(array, targetIndex);
		if(result!= -1){
			System.out.println( "not mid");
		}
		else{
			System.out.println( " mid");
		}
		
		

	}

}
