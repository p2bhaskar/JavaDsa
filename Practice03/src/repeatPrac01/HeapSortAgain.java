package repeatPrac01;

public class HeapSortAgain {

	public static void main(String[] args) 
	{
		String[] strArr =
			{
	            "apple", "banana", "cherry", "date", "elderberry",
	            "fig", "grape", "honeydew", "kiwi", "lemon",
	            "mango", "nectarine", "orange", "pear", "quince",
	            "raspberry", "strawberry", "tangerine", "uva", "watermelon"
	        };
		
		HeapSortAgain hsa = new  HeapSortAgain(); 
		hsa.sort(strArr);
		hsa.print(strArr);

	}

	private void print(String[] strArr) 
	{
		for(String s:strArr) 
		{
			System.out.print(s + " ");
		}
		
		
	}

	private void sort(String[] strArr) 
	{
		int n = strArr.length;
		
		//heapifying subtree 
		//building heap
		for(int i=n/2-1;i>=0;i--)
		{
			heapify(strArr,n,i);
		}
		
		//swapping first and last element after heap is made
		
		for(int i=n-1;i>=0;i--)
		{
			String temp = strArr[i];
			strArr[i] = strArr[0];
			strArr[0] = temp;
			
			heapify(strArr,i,0);
		}
		
	}

	private void heapify(String[] strArr, int n, int i)
	{
		int largest = i;
		int leftChild = 2*i+1;
		int rightChild = 2*i+2;
		
		if(leftChild<n && strArr[leftChild].compareToIgnoreCase(strArr[largest])>0)
		{
			largest=leftChild;
		}
		if(rightChild<n && strArr[rightChild].compareToIgnoreCase(strArr[largest])>0)
		{
			largest=rightChild;
		}
		if(largest != i) 
		{
			String temp = strArr[largest];
			strArr[largest] = strArr[i];
			strArr[i] = temp;
			
			heapify(strArr,n,largest);
			
		}
		
		
		
	}

}
