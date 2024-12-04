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
	/*
	 * 
The mid index is used as a starting point in the binary search algorithm. Even if the target is not located at the mid index, the binary search efficiently narrows down the range of the search based on the comparison of the target with the value at the mid index.

How Binary Search Works (Step-by-Step)
Initial Step:

Calculate the mid index for the current range of the array.
Check if the element at the mid index equals the target.
Decision Making:

If the element at the mid index is equal to the target, you've found the
 element, and the search ends.
If the element at the mid index is greater than the target, 
the target must lie in the left half of the array. Update the 
search range: right = mid - 1.
If the element at the mid index is less than the 
target, the target must lie in the right half of the array. Update the search range: left = mid + 1.
Repeat:

Recalculate the new mid index in the updated range and 
repeat the process until the target is found or the search range becomes invalid (left > right).
Why Use the Mid Index?
The mid index divides the array into two halves, which is the 
core idea of binary search. Instead of searching through the entire array, the algorithm only
 focuses on the relevant half. This reduces the search space exponentially.
	 * 
	 */

}
