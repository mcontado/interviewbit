package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RepeatAndMissingNumberArray {
	
	/*
	 You are given a read only array of n integers from 1 to n.
	 Each integer appears exactly once except A which appears twice and B which is missing.
	 Return A and B.
	 Note: Your algorithm should have a linear runtime complexity. 
	       Could you implement it without using extra memory?
	 Note that in your output A should precede B.
	 
	 Ex:
	 Input:[3 1 2 5 3] 
	 Output:[3, 4] 
	
	A = 3, B = 4
	 * */
	
	public static ArrayList<Integer> repeatedNumber(final List<Integer> a) {
		ArrayList<Integer> res = new ArrayList<Integer>();
		int rep = -1;
		int miss = -1;
		
		int N = a.size();
		//Sort first the array
		Collections.sort(a);
		//set the sum to the first digit in the array
		int sum = a.get(0);
		
		for (int i=1; i<N; i++) {
			if (a.get(i) == a.get(i-1)) {
				rep = a.get(i);
			}
			sum += a.get(i);
		}
		
		miss = ((N * (N + 1)) / 2) - sum + rep;
		
		res.add(rep);
		res.add(miss);
		
		
		return res;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> a = new ArrayList<Integer>(Arrays.asList(5,4,2,2,1));
		ArrayList<Integer> res = repeatedNumber(a);
		System.out.println(res);
	}

}
