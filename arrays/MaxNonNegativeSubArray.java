package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxNonNegativeSubArray {

	/*
	 Find out the maximum sub-array of non negative numbers from an array.
	 The sub-array should be continuous. 
	 That is, a sub-array created by choosing the second and fourth element and 
	 	skipping the third element is invalid.

	Maximum sub-array is defined in terms of the sum of the elements in the sub-array. 
	Sub-array A is greater than sub-array B if sum(A) > sum(B).
	
	Example:
	A : [1, 2, 5, -7, 2, 3]
	The two sub-arrays are [1, 2, 5] [2, 3].
	The answer is [1, 2, 5] as its sum is larger than [2, 3]
	
	NOTE: If there is a tie, then compare with segment's length and return segment which has maximum length
	NOTE 2: If there is still a tie, then return the segment with minimum starting index
	 * */
	
	/*
	 Pseudocode
	 Loop i = 1 to Array.length :
        IF current element is positive :
                update current sum
                compare max sum with current sum
                update max sum
                update max ranges
        ELSE :
            current sum := 0
            update current ranges.
	EndLoop;
		
		return elements of max ranges
	 * */
	
	public static ArrayList<Integer> maxset(ArrayList<Integer> a) {
		ArrayList<Integer> maxArray = new ArrayList<Integer>();
		ArrayList<Integer> newArray = new ArrayList<Integer>();
		int maxSum = 0;
		int newSum = 0;
		
		for (Integer i: a) {
			//checks if positive, add cumulative sum, then add to newArray
			if (i >= 0) {
				newSum += i;
				newArray.add(i);
			} else {
				//if negative, set the newSum back to 0 and reset the newArray.
				newSum = 0;
				newArray = new ArrayList<Integer>();
			}
			
			//checks if the newSum > maxSum
			//Also handles if currentsum is equals to the last one AND the size of the newArray is greater than the previous
			if (newSum > maxSum || (maxSum == newSum && newArray.size() > maxArray.size())) {
				maxSum = newSum;
				maxArray = newArray;
			}
		}
		
		return maxArray;
		
	}
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(1,2,5,-7,2,3,1,1,1));
		ArrayList<Integer> res = maxset(a);
		System.out.println(res);

	}

}
