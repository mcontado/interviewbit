package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class RotateArray {

	public static ArrayList<Integer> rotateArray(ArrayList<Integer> A, int B) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		ArrayList<Integer> toAdd = new ArrayList<Integer>();
		
		if (B > A.size()) {
			ret.add(A.get(A.size()-1));
			for (int i=0; i<A.size()-1; i++) {
				ret.add(A.get(i));
			}
			return ret;
		}
		
		for (int i=0; i<B; i++) {
			toAdd.add(A.get(i));
		}
		
		for (int i = 0; i < A.size(); i++) {
			if (i+B < A.size())
				ret.add(A.get(i + B));
		}
		
		for (int i=0; i<toAdd.size(); i++) {
			ret.add(toAdd.get(i));
		}
		return ret;
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7));
		int b = 3;
		
		ArrayList<Integer> res = rotateArray(arr, 56);
		
		System.out.println(res);
		
		

	}

}
