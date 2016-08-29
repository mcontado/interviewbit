package arrays;

import java.util.ArrayList;

public class KthRowPascal {

	public static ArrayList<Integer> getRow(int A) {

		ArrayList<Integer> res = new ArrayList<>();

		res.add(1);

		for (int k = 0; k < A; k++) {
			int val;
			int last = 0;
			for (int i = 0; i < k + 1; i++) {
				val = res.get(i);
				if (i - 1 >= 0)
					val += last;
				last = res.get(i);
				res.set(i, val);
			}

			res.add(res.get(0));
		}

		return res;

	}
	
	//my version of getting row in pascal triangle, rebuilt from generation of pascal t.
	public static ArrayList<Integer>  getRowAtPascal(int A) {
		ArrayList<Integer> finalRes = new ArrayList<>();

		//checks if the input is 0, then just print 1.
		if (A == 0) {
			finalRes.add(1);
			return finalRes;
		}

		//needed A+1 because we are zero based indexing
		int numRows = A+1;
		ArrayList<ArrayList<Integer>> res = new ArrayList<>();
		
		res.add(new ArrayList<>());
		res.get(0).add(1);

		for (int currentRow = 1; currentRow < numRows; currentRow++) {

			res.add(new ArrayList<>());

			res.get(currentRow).add(1);

			for (int col = 0; col < currentRow - 1; col++) {
				int num = res.get(currentRow - 1).get(col) + res.get(currentRow - 1).get(col + 1);
				res.get(currentRow).add(num);
			}

			res.get(currentRow).add(1);
			
			//Added to get the current row to match the given input
			if (currentRow == A) {
				finalRes.addAll(res.get(currentRow));
				
			}

		}

		return finalRes;
	}
	
	public static void main(String args[]) {
		
		ArrayList<Integer> res = getRowAtPascal(4);
		System.out.println(res);
	}
	
	

}
