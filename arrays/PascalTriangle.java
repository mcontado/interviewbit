package arrays;

import java.util.Scanner;
import java.util.ArrayList;

public class PascalTriangle {

	public static void print(int n) {
		int[] previousRow;
		int[] currentRow = { 1 };
		printArray(currentRow);
		previousRow = currentRow;
		for (int i = 2; i <= n; i++) {
			currentRow = new int[i];
			currentRow[0] = 1;
			currentRow[i - 1] = 1;
			for (int j = 0; j <= i - 3; j++) {
				currentRow[j + 1] = previousRow[j] + previousRow[j + 1];
			}
			printArray(currentRow);
			previousRow = currentRow;
		}
	}

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	// InterviewBit
	public static ArrayList<ArrayList<Integer>> generate(int a) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

		if (a == 0)
			return result;

		for (int i = 0; i < a; i++) {
			ArrayList<Integer> thisRow = new ArrayList<Integer>();
			for (int j = 0; j <= i; j++) {
				if (j == 0)
					thisRow.add(1);
				else if (j < i) {
					int thisNum = result.get(i - 1).get(j - 1) + result.get(i - 1).get(j);
					thisRow.add(thisNum);
				} else if (j == i)
					thisRow.add(1);
			}
			result.add(thisRow);
		}

		return result;
	}

	// InterviewBit recommended solution
	public static ArrayList<ArrayList<Integer>> generatePascal(int A) {
		int numRows = A;
		ArrayList<ArrayList<Integer>> res = new ArrayList<>();

		if (A == 0)
			return res;

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

		}

		return res;
	}

	public static void printArrayListOfPascal(ArrayList<ArrayList<Integer>> pascal) {
		for (int i = 0; i < pascal.size(); i++) {
			// System.out.print(array[i] + " ");
			System.out.println(pascal.get(i) + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the row number upto which Pascal's triangle has to be printed: ");
		int row = scanner.nextInt();
		// generate(row);
		printArrayListOfPascal(generatePascal(row));
	}

}
