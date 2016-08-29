package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxSumSubarray {

	/*
	 Problem:
	 	Find the contiguous subarray within an array (containing at least one number) which has the largest sum.
		
		Given the array [-2,1,-3,4,-1,2,1,-5,4], the contiguous subarray [4,-1,2,1] has the largest sum = 6.
		
		For this problem, return the maximum sum.
	 * */
	
	//DO NOT MODIFY THE LIST
	public static int maxSubArray(final List<Integer> a) {
		int currentSum = 0, maxSum = 0;
		
		for (int x:a) {
			currentSum += x;
			
			if (currentSum < 0) 
				currentSum = 0;
			
			if (currentSum > maxSum) 
				maxSum = currentSum;
			
		}
		
		return maxSum;
	}
	public static void main(String[] args) {
		List<Integer> a = new ArrayList<Integer>(Arrays.asList(-2,1,-3,4,-1,2,1,-5,4));
		System.out.println(maxSubArray(a));

	}

}
