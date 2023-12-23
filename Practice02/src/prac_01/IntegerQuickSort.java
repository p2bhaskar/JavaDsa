package prac_01;

public class IntegerQuickSort 
{
	public static void main(String[] args) 
	{
		int[] arr = {23,67,12,34,9,3,1,1,8};
		
		int length = arr.length-1;
		IntegerQuickSort  iqs = new IntegerQuickSort();
		iqs.quickSort(arr,0,length);
		iqs.print(arr);
		
	}

	private void print(int[] arr) 
	{
		for(int i:arr) 
		{
			System.out.print(i+" ");
		}
		
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
			while(arr[low]<pivot)
			{
				low++;
				
			}
			while(arr[high]>pivot)
			{
				high--;
				
			}
			if(high>=low) {
				int temp = arr[low];
				arr[low] = arr[high];
				arr[high] = temp;
				
				low++;
				high--;
			}
			
		}
		return low;
	}
}
