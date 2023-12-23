package star_patterns;

import java.util.HashSet;
import java.util.Set;

public class WriteAndDelete3 {
	public static void main(String[] args) {
		// int[] arr = {24,36,-16,9,0,4,3,21,-100,-10,200};
		WriteAndDelete3 wad = new WriteAndDelete3();

		int[] arr = { 2, 2, 4, 5, 4, 4, 2, 1, 2, 3, 4, 5, 4, 2, 1, 3, 4 };

		int length = arr.length - 1;

		int k = 2;
		int count = 0;

		for (int i = 0; i < length; i = i + 2) {
			for (int j = i; j <i+ k; j = j + k) {
				if (arr[j] == arr[j + 1]) {
					count++;
				} else {
					count += 2;
				}
			}
		}

		System.out.println(count);

	}

}
