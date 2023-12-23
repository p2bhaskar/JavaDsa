package prac_01;

public class StringSorting_2
{

	public static void main(String[] args) 
	{ 
		String[] strArr = {"Guava","Pineapple","Banana","Apple","Mango"};
		int length = strArr.length-1;
		
		StringSorting_2 ss = new StringSorting_2();
		
		ss.quickSort(strArr,0,length);
		
		System.out.println("gfgg");
		ss.display(strArr);

	}

	private void display(String[] strArr) 
	{
		for(String s:strArr) {
			System.out.print(s+" ");
		}
		
	}

	private void quickSort(String[] strArr, int low, int high) 
	{
	   int pivot = partition(strArr,low,high);
	   
	   if(pivot-1>low) {
		   quickSort(strArr,low,pivot-1);
	   }
	   if(pivot<high) {
		   quickSort(strArr,pivot,high);
	   }
		
	}

	private int partition(String[] strArr, int low, int high) {
		String pivot = strArr[(low+high)/2];
		while(low<=high) 
		{
			while(strArr[low].compareToIgnoreCase(pivot)<0) 
			{
				low++;
			}
			while(strArr[high].compareToIgnoreCase(pivot)>0) 
			{
				high--;
			}
			if(low<=high) {
				String temp = strArr[high];
				strArr[high] = strArr[low];
				strArr[low] = temp;
				
				low++;
				high--;
			}
		}
		return low;
		
	}
	


}
