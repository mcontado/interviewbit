package arrays;
import java.util.ArrayList;
import java.util.Arrays;

public class RotateMatrix {
	
	public static void rotate(ArrayList<ArrayList<Integer>> a) {
		int n = a.size();
		
		for (int i = 0; i < n/2; i++) {
			for (int j = 0; j < Math.ceil(((double) n)/2.); j++) {
				int temp = a.get(i).get(j);
				a.get(i).set(j, a.get(n-1-j).get(i));
				a.get(n-1-j).set(i, a.get(n-1-i).get(n-1-j));
				a.get(n-1-i).set(n-1-j, a.get(j).get(n-1-i));
				a.get(j).set(n-1-i, temp);
			}
		}
	}

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(1,2,3));
		ArrayList<Integer> b = new ArrayList<Integer>(Arrays.asList(4,5,6));
		ArrayList<Integer> c = new ArrayList<Integer>(Arrays.asList(7,8,9));
		ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
		arr.add(a);
		arr.add(b);
		arr.add(c);
		
		System.out.println(arr);
		rotate(arr);
		System.out.println(arr);
		

	}

}
