package arrays;

public class RotateElementByNPlaces {

	public static void main(String[] args) 
	{
		int[] arr = {23,76,90,21,34,56,67,78,67,90,56};
	    //int[] arr = {23,0,1};
		int i = 0;
		int n = arr.length-1;
		int k=7;
		//int k=arr.length-k1;
		
		for(i=n;i-k>=0;i--) 
		{
			int temp =arr[i];
			arr[i] = arr[i-k];
			arr[i-k] = temp;
		}
		
		for(int j=i;j>0;j-- ) 
		{
			int temp = arr[j];
			arr[j] = arr[j-1];
			arr[j-1] = temp;
		}
		for(int e:arr) 
		{
			System.out.print(e+" ");
		}
		
		

	}

}