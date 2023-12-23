package pckg_01;

public class MinSubArrPrblm {
	public static void main(String[] args) {
		int[] arr = { 12, 2, 4, 8, 2, 4, 0, 10, 15, 16, 20 };

		int min_so_far = Integer.MAX_VALUE;
		int min_till_here = 0;

		int s = 0;
		int start = s;// starting index of min subarray
		int end = 0;// ending index of max subarray

		for (int i = 0; i < arr.length; i++) {

			min_till_here = min_till_here + arr[i];

			if (min_till_here < min_so_far) {
				min_so_far = min_till_here;

				start = s;
				end = i;
			}

			// Change 1: Check if min_till_here is greater than 0 before resetting
			if (min_till_here > 0) {
				min_till_here = 0;
				// Change 2: Update start index (s) to i + 1
				s = i + 1;
			}

		}
		System.out.print("Min subrray is [ ");
		for (int i = start; i <= end; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.print(" ]  And sum of Min subrray is : " + min_so_far);

	}

}
