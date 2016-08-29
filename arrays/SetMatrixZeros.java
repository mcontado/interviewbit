package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class SetMatrixZeros {
	/*
	 Given an m x n matrix of 0s and 1s, if an element is 0, set its entire row and column to 0.
	 Do it in place.

	 Example:
	 	Given array A as:
	 	1 0 1
		1 1 1 
		1 1 1
		
	Output:
		0 0 0
		1 0 1
		1 0 1

	Note that this will be evaluated on the extra memory used. Try to minimize the space and time complexity.

	 * */
	
	public static void setZeroes(ArrayList<ArrayList<Integer>> a) {
	    boolean firstRowZero = false;
        boolean firstColumnZero = false;
 
        //set first row and column zero or not
        for(int i=0; i<a.size(); i++){
            if(a.get(i).get(0) == 0){
                firstColumnZero = true;
                break;
            }
        }
 
        for(int i=0; i<a.get(0).size(); i++){
            if(a.get(0).get(i) == 0){
                firstRowZero = true;
                break;
            }
        }
 
        //mark zeros on first row and column
        for(int i=1; i<a.size(); i++){
            for(int j=1; j<a.get(0).size(); j++){
                if(a.get(i).get(j) == 0){
                	a.get(i).set(0, 0);
                	a.get(0).set(j, 0);
                }
            }
        }
 
        //use mark to set elements
        for(int i=1; i<a.size(); i++){
            for(int j=1; j<a.get(0).size(); j++){
                if(a.get(i).get(0) == 0 || a.get(0).get(j) == 0){
                	a.get(i).set(j, 0);
                }
            }
        }
 
        //set first column and row
        if(firstColumnZero){
            for(int i=0; i<a.size(); i++)
               a.get(i).set(0, 0);
        }
 
        if(firstRowZero){
            for(int i=0; i<a.get(0).size(); i++)
            	a.get(0).set(i,	0);
        }
		
		
		
		
	}

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(1,0,1));
		ArrayList<Integer> b = new ArrayList<Integer>(Arrays.asList(1,1,1));
		ArrayList<Integer> c = new ArrayList<Integer>(Arrays.asList(1,1,1));
		ArrayList<Integer> d = new ArrayList<Integer>(Arrays.asList(1,0,0,0));
	
		ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
		arr.add(a);
		arr.add(b);
		arr.add(c);
		//arr.add(d);
		
		setZeroes(arr);
		
		System.out.println(arr);

	}

}
