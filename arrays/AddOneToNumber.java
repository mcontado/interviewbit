package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class AddOneToNumber {

	/*
	 Given a non-negative number represented as an array of digits,

	add 1 to the number ( increment the number represented by the digits ).
	
	The digits are stored such that the most significant digit is at the head of the list.
	
	Example: If the vector has [1, 2, 3] the returned vector should be [1, 2, 4]
	
		As 123 + 1 = 124
	
	Q : Can the input have 0’s before the most significant digit. Or in other words, is 0 1 2 3 a valid input?
	A : For the purpose of this question, YES
	Q : Can the output have 0’s before the most significant digit? Or in other words, is 0 1 2 4 a valid output?
	A : For the purpose of this question, NO. Even if the input has zeroes before the most significant digit.
	 * */
	
	public static ArrayList<Integer> plusOne(ArrayList<Integer> a) {
		
		int carry = 1; //number to be added
		int num; // integer to hold the value per digit
		
		//start to traverse from the end of the list in order to add 1.
		for (int i=a.size()-1; i>=0; i--) {
			num = a.get(i);
			num += carry;
			carry = 0;
			
			if (num == 10) {
				num = 0;
				carry = 1;
			}
			
			a.set(i, num);
			
		}
		
		//handle those results that has carry over. like 99 + 1 = 100
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		if (carry == 1)
			result.add(1);
		
		for (int x : a) {
			//to handle those with preceding 0s, should be ignored
			if (x == 0 && result.size() == 0)
				continue;
			
			result.add(x);
		}
		
		
	
		return result;
	}
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(0,0,9));
		
		ArrayList<Integer> res = plusOne(a);
		
		System.out.println(res);
		

	}

}
