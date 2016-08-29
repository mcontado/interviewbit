package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class AntiDiagonals {

	public static ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> a) {

		ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> temp = new ArrayList<Integer>();

		int n = a.size();
		if (n == 0)
			return ans;

		int i, d;
		for (d = 0; d <= 2 * (n - 1); d++) {
			for (i = 0; i <= d; i++) {
				if (i < n && d - i < n) {
					temp.add(a.get(i).get(d-i));
				}
			} //end of inner for loop
			ans.add(new ArrayList<Integer>(temp));
			
			temp.clear();
		} // end of outer for loop
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(1,2,3));

		ArrayList<Integer> b = new ArrayList<Integer>(Arrays.asList(4,5,6));
		
		ArrayList<Integer> c = new ArrayList<Integer>(Arrays.asList(7,8,9));
		
		ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
		arr.add(a);
		arr.add(b);
		arr.add(c);
		
		ArrayList<ArrayList<Integer>> res = diagonal(arr);
		
		System.out.println(res);

	}

}
