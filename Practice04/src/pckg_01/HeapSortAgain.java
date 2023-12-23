package pckg_01;

public class HeapSortAgain 
{

	public static void main(String[] args) 
	{
		int[] arr= {35,23,12,31,10,-18,0,3}; 
		int n = arr.length-1;
		
		HeapSortAgain hsa = new HeapSortAgain();
		//hsa.sort(arr);
		//hsa.print(arr);
		
		hsa.quickSort(arr,0,n);
		hsa.print(arr);
		
		
		

	}

	private void quickSort(int[] arr, int low, int high) 
	{
		int pivot = partition(arr,low,high);
		
		if(pivot-1>low) {
			quickSort(arr,low,pivot-1);
		}
		if(pivot<high) {
			quickSort(arr,pivot,high);
		}
		
		
		
	}

	private int partition(int[] arr, int low, int high)
	{
		int pivot = arr[(low+high)/2];
		while(low<=high)
		{
			while(arr[low] < pivot ) {
				low++;
			}
			while(arr[high] > pivot ) {
				high--;
			}
			if(low<=high)
			{
				int temp = arr[low];
				arr[low] = arr[high];
				arr[high] = temp;
				
				low++;
				high--;
				
			}
		}
		return low;
	}

	private void print(int[] arr) {
		for(int i:arr) {
			System.out.print(i+" ");
		}
		
	}

	private void sort(int[] arr) 
	{
		
		int n = arr.length;
		
		for(int i=n/2-1;i>=0;i--) {
			heapify(arr,n,i);
		}
		
		for(int i=n-1;i>0;i--) 
		{
			int temp =arr[i];
			arr[i] = arr[0];
			arr[0] =  temp;
			
			heapify(arr,i,0);
			
			
		}
		
	}

	private void heapify(int[] arr, int n, int i) 
	{
		int largest = i;
		int leftChild = 2*i+1;
		int rightChild = 2*i+2;
		
		if(n>leftChild && arr[leftChild]>arr[largest]) {
			largest = leftChild;
		}
		if(n>rightChild && arr[rightChild]>arr[largest]) {
			largest = rightChild;
		}
		if(largest != i) {
			int temp = arr[i];
			arr[i] = arr[largest] ;
			arr[largest] = temp;
			
			heapify(arr,n,largest);
		}
		
		
	}

}
