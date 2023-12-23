package prac_01;

public class ArrayPrblm_01 {

	public static void main(String[] args) {
		int[] Arr = { 112, 23, 67, 34, 85, 24, 89, 23, 11, 23 };

		int length = Arr.length - 1;

		System.out.println("Original Array");
		for (int i : Arr) {
			System.out.print(i + " ");
		}
		System.out.println("");

		ArrayPrblm_01 Ap = new ArrayPrblm_01();

		Ap.quickSort(Arr, 0, length);

		System.out.println("Sorted Array");

		Ap.display(Arr);

	}

	int partition(int[] arr, int i, int j) {
		int pivot = arr[(i + j) / 2];
		while (i <= j) {
			while (arr[i] < pivot) {
				i++;
			}
			while (arr[j] > pivot) {
				j--;
			}

			if (i <= j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;

			}
		}
		return i;
	}

	private void quickSort(int[] arr, int low, int high) {
		int pivot = partition(arr, low, high);

		if (low < pivot - 1) {
			quickSort(arr, low, pivot - 1);
		}
		if (high > pivot) {
			quickSort(arr, pivot, high);
		}

	}

	private void display(int[] arr) {
		for (int a : arr) {
			System.out.print(a + " ");
		}

	}

}
