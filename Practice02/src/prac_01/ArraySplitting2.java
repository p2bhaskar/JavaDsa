package prac_01;

//import java.util.ArrayList;
//import java.util.List;

public class ArraySplitting2 
{
	public static void main(String[] args)
	{
		int[] testArr = {2,12,-3,6,9,0,-12,5,-7,90,0,10,-23,78,10};
		//boolean even=true;
		//boolean positive=true;
		//boolean negative =true;
		//boolean odd = true;
		
		int[] evenArr =ArraySplitting2.extractArray(testArr,true,false);
		int[] negativeArr=ArraySplitting2.extractArray(testArr,false,true);
		System.out.println("------------EVEN ARRAY-----------");
		ArraySplitting2.print(evenArr);
		System.out.println(" ");
		System.out.println("-----------NEGATIVE ARRAY------------");
		ArraySplitting2.print(negativeArr);
		
	}
	
	static void print(int[] arr) {
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
	
	static int[] extractArray(int[] arr,boolean even,boolean negative)
	{
		int count =0;
		for(int i:arr) 
		{
			if((even && i%2==0) || (!even && i%2!=0) || (negative && i <0 && i !=0) || (!negative && i>0)) {
				count++;
			}
			
		}
		
		int[] resultArr = new int[count];
		int index =0;
		
		 // Copy elements that satisfy the criteria
        for (int num : arr) 
        {
            if ((even && num % 2 == 0) || (!even && num % 2 != 0 && !negative) || (negative && num <0 && num !=0)) 
            {
                resultArr[index++] = num;
            }
	    }
        
        return resultArr;
		
	}	
		
		
}


