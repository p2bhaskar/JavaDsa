package prac_01;

import java.util.ArrayList;
import java.util.List;

public class ArraySplitting {
	public static void main(String[] args) {
		int[] testArr = { 2, 12, -3, 6, 9, 0, -12, 5, -7, 90, 0, 0, -23, 78, 10 };

		List<Integer> evenList = new ArrayList<>();
		List<Integer> oddList = new ArrayList<>();
		List<Integer> negativeList = new ArrayList<>();

		for (int i = 0; i <= testArr.length - 1; i++) {
			if (testArr[i] % 2 == 0) {
				evenList.add(testArr[i]);
			}
			if (testArr[i] % 2 != 0) {
				oddList.add(testArr[i]);
			}
			if (testArr[i] < 0) {
				negativeList.add(testArr[i]);
			}

		}

		System.out.println(evenList);
		System.out.println(oddList);
		System.out.println(negativeList);

	}

}
