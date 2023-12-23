package prac_01;

public class HeapSortString {

	public static void main(String[] args) 
	{
		String[] strArr = {"Sun","Tue","Wed","Thurs","Fri"};
		
		HeapSortString hss = new HeapSortString();
		
		hss.sort(strArr);
		hss.print(strArr);
		

	}

	private void print(String[] strArr) {
		for(String s:strArr) {
			System.out.print(s + " ");
		}
		
	}

	private void sort(String[] strArr) 
	{
		int n = strArr.length;
		
		for(int i = n/2-1;i>=0;i--) 
		{
			heapify(strArr,n,i);
		}
		
		 for (int i = n - 1; i > 0; i--) {
	            // Swap the current root with the last element
	            String temp = strArr[0];
	            strArr[0] = strArr[i];
	            strArr[i] = temp;

	            // Call heapify on the reduced heap
	            heapify(strArr, i, 0);
	        }
		
	}

	private void heapify(String[] strArr, int n, int i) 
	{
		int largest = i;
		int left = i*2+1;
		int right = i*2+2;
		
		if(left<n && strArr[left].compareTo(strArr[largest])>0)
		{
			largest = left;
		}
		if(right<n && strArr[right].compareTo(strArr[largest])>0)
		{
			largest = right;
		}
		
		if(largest != i) 
		{
			String temp = strArr[largest];
			strArr[largest] = strArr[i];
			strArr[i]=temp;
			
			heapify(strArr,n,largest);
		}
		
		
	}

}
