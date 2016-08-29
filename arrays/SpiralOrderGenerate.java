package arrays;

import java.util.ArrayList;

public class SpiralOrderGenerate {
	
	public static ArrayList<ArrayList<Integer>> generateMatrix(int a) {
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		
		//Initialize the array at first load
		for (int i=0; i<a; i++) {
			ArrayList<Integer> zero = new ArrayList<Integer>();
			//initialize that array with 0
			for (int j=0; j<a; j++) {
				zero.add(0);
			}
			//then add it to the row
			res.add(zero);
		}

		int numToAdd = 1;
		int top = 0;
		int bottom = a-1;
		int left = 0;
		int right = a-1;
		int dir = 0; // 0 - going right, 1 - going down, 2 - going left, 3 - going up
		
		while (numToAdd <= a*a) {
			
			for (int i = left; i<= right; i++) {
				//res.get(top).set(i, numToAdd);
				res.get(top).set(i, numToAdd);
				numToAdd++;
			}
			top++;
			
			for (int i = top; i <= bottom; i++) {
				res.get(i).set(right, numToAdd);
				numToAdd++;
			}
			right--;
			
			for (int i=right; i>=left; i--) {
				res.get(bottom).set(i, numToAdd);
				numToAdd++;
			}
			bottom--;
			
			for(int i=bottom; i>= top; i--) {
				res.get(i).set(left, numToAdd);
				numToAdd++;
			}
			left++;
		}
		
		return res;
	}
	
	
	public static int[][] generateMatrix2DArr(int n) {
	    int[][] result = new int[n][n];
	 
	    int k=1; 
	    int top=0;
	    int bottom=n-1;
	    int left=0;
	    int right=n-1;
	 
	    while(k<=n*n){
	        for(int i=left; i<=right; i++){
	            result[top][i]=k;
	            k++;
	        }    
	        top++;
	 
	        for(int i=top; i<=bottom; i++){
	            result[i][right]=k;
	            k++;
	        }
	        right--;
	 
	        for(int i=right; i>=left; i--){
	            result[bottom][i]=k;
	            k++;
	        }
	        bottom--;
	 
	        for(int i=bottom; i>=top; i--){
	            result[i][left] = k;
	            k++;
	        }
	        left++;
	    }
	 
	    return result;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> a = generateMatrix(4);
		System.out.println(a);
		
//		int[][] test = generateMatrix2DArr(3);
//		for (int i=0; i<test.length; i++) {
//			for (int j=0; j<test.length; j++) {
//				System.out.print(test[i][j] + " ");
//			}
//		}
	}

}
