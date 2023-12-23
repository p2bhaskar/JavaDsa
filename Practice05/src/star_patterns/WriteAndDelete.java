package star_patterns;

import java.util.HashSet;
import java.util.Set;

public class WriteAndDelete
{
  public static void main(String[] args)
  {
	//int[] arr = {24,36,-16,9,0,4,3,21,-100,-10,200};
	  int[] arr = {24,36,-16,};
	
	//int length = arr.length-1;
	WriteAndDelete wad = new WriteAndDelete();
	
	
	
	Set<Set<Integer>> sets = new HashSet<>();
	
	for(int i=0;i<arr.length;i++) {
		for(int j=i;j<arr.length;j++) {
			Set<Integer> set = new HashSet<>();
			for(int k=i;k<=j;k++) {
			
			//System.out.print(arr[k]+" ");
				set.add(arr[k]);
				sets.add(set);
			}
		}
		System.out.println("");
	}
	
	System.out.println(sets);
	
}



private void maxSubArray(int[] arr) 
{
	int min_till_here = 0;
	int min_so_far = Integer.MAX_VALUE;
	
	int indexTrack = 0;
	int start = 0;
	int end = 0;
	
	for(int i=0;i<arr.length;i++)
	{
		
		min_till_here = min_till_here + arr[i];
		
		if(min_till_here < min_so_far) 
		{
			
			min_so_far = min_till_here;
			
			start = indexTrack;
			end = i;
		}
		if(min_till_here > 0) 
		{
			
			min_till_here = 0;
			
			 indexTrack = i+1;
			
		}
	}
	
	for(int i=start;i<=end;i++) {
		System.out.print(arr[i] +" ");
	}
	
}


}
