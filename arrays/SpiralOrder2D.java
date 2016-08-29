package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralOrder2D {
	
	//Using 2 dim array int[][]
	public static void printSpiral(int[][] arr) {
		int row = arr.length;
		int col = arr.length;
		
		int top = 0;
		int bottom = row-1;
		int left = 0;
		int right = col-1;
		int dir = 0; // 0 - going right, 1 - going down, 2 - going left, 3 - going up
		
		while (top <= bottom && left <= right) {
			//going to the right direction
			if (dir == 0) {
				for (int i=left; i<=right; i++) {
					System.out.print(arr[top][i] + " ");
				}
				top++;
				dir = 1;
			} 
			//going down direction
			else if (dir == 1) {
				for (int i=top; i<=bottom; i++) {
					System.out.print(arr[i][right] + " ");
				}
				right--;
				dir = 2;
			} 
			//going left direction 
			else if (dir == 2) {
				for (int i=right; i>=left; i--) {
					System.out.print(arr[bottom][i] + " ");
				}
				bottom--;
				dir = 3;
			} 
			//going UP direction
			else if (dir == 3) {
				for (int i=bottom; i>= top; i--) {
					System.out.print(arr[i][left] + " ");
				}
				left++;
				dir = 0; 
			}
		}
		
	}
	
	//using an array of arraylist
	public static ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> a) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		int row = a.size();
		int col = a.get(0).size();  //to get the column size
		
		int top = 0;
		int bottom = row-1;
		int left = 0;
		int right = col-1;
		int dir = 0; // 0 - going right, 1 - going down, 2 - going left, 3 - going up
		
		while (top <= bottom && left <= right) {
			// going right direction
			if (dir == 0) {
				for (int i=left; i<=right; i++) {
					result.add(a.get(top).get(i));
				}
				top++;
				dir = 1; //go down now;
			} 
			//going down direction
			else if (dir == 1) {
				for (int i=top; i<=bottom; i++) {
					result.add(a.get(i).get(right));
				}
				right--;
				dir = 2;
			} 
			//going left direction
			else if (dir == 2) {
				for (int i=right; i>=left; i--) {
					result.add(a.get(bottom).get(i));
				}
				bottom--;
				dir = 3;
			}
			//going up direction
			else if (dir == 3) {
				for (int i=bottom; i>= top; i--) {
					result.add(a.get(i).get(left));
				}
				left++;
				dir = 0;
			}
		}
		
		return result;
	}
	public static void main(String[] args) {
		int [][] matrix = {{2,4,6,8},
						   {5,9,12,16},
						   {2,11,5,9},
						   {3,2,1,8}};
		//printSpiral(matrix);
		

		
		ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> a1 = new ArrayList<Integer>(Arrays.asList(1,2));
		ArrayList<Integer> a2 = new ArrayList<Integer>(Arrays.asList(3,4));
		ArrayList<Integer> a3 = new ArrayList<Integer>(Arrays.asList(5,6));

		arr.add(a1);
		arr.add(a2);
		arr.add(a3);
		
		System.out.println("");
		System.out.println(spiralOrder(arr));
	}

}
