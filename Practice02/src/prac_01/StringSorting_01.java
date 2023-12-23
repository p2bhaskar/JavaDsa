package prac_01;

public class StringSorting_01 {

	public static void main(String[] args) {
		String[] strArr = { "Guava", "Pineapple", "Banana", "Apple", "Mango" };
		int length = strArr.length - 1;

		StringSorting_01 ss = new StringSorting_01();
		ss.quickSort(strArr, 0, length);
		ss.display(strArr);

	}

	private void display(String[] strArr) {
		for (String s : strArr) {
			System.out.print(s);
		}

	}

	private void quickSort(String[] strArr, int low, int high) {
		int pivot = partition(strArr, low, high);
		if (pivot - 1 > low) {
			quickSort(strArr, low, pivot - 1);
		}
		if (pivot < high) {
			quickSort(strArr, pivot, high);
		}

	}

	private int partition(String[] strArr, int i, int j) {
		String pivot = strArr[(i + j) / 2];
		while (i <= j) {
			while (strArr[i].compareTo(pivot) < 0) {
				i++;
			}
			while (strArr[j].compareTo(pivot) > 0) {
				j--;
			}
			if (i <= j) {
				String temp = strArr[i];
				strArr[i] = strArr[j];
				strArr[j] = temp;
				i++;
				j--;
			}
		}
		return i;
	}

}
