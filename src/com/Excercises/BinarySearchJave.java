package com.Excercises;

public class BinarySearchJave {
	
	public static int binarySearch(int[] array,int targetValue){
		int leftMost=0;
		int rightMost=array.length -1;
		while(leftMost<=rightMost){
			int mid=leftMost+(rightMost-leftMost)/2;
			if(array[mid]==targetValue){
				return mid;
				
			}
			  // If target is greater, ignore the left half
            if (array[mid] < targetValue) {
                leftMost = mid + 1;
            } 
            // If target is smaller, ignore the right half
            else {
                rightMost= mid - 1;
            }
		}
		return -1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]={2,45,52,4,56,2,5};
		int target=5;
		int result=binarySearch(array, target);
		if(result != -1){
			System.out.println("found the arrayElement "+ result);
		}else{
			System.out.println("not found the arrayElement ");
		}

	}

}
