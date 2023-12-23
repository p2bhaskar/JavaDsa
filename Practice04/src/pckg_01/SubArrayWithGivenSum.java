package pckg_01;

import java.util.HashMap;

public class SubArrayWithGivenSum 
{

	public static void main(String[] args) 
	{
		int[] arr = {23,-12,3,67,89,65,34,21,0,4,-12};
		int sum = 25;
		
		SubArrayWithGivenSum swgs = new SubArrayWithGivenSum();
		
		swgs.subArraySum(arr,sum);

	}

	private void subArraySum(int[] arr, int sum) 
	{
		int curSum = 0;
		int start = 0;
		int end = -1;
		
		HashMap<Integer,Integer> hm = new HashMap<>();
		for(int i=0;i<arr.length-1;i++) 
		{
			curSum += arr[i];
			
			if(curSum-sum==0) 
			{
				
				start = 0;
				end = i;
				break;
			}
			if(hm.containsKey(curSum-sum)) 
			{
				start = hm.get(curSum-sum) + 1;
				end = i;
				break;
				
		    }
			hm.put(curSum,i);
			
		}
		if(end == -1) {
			System.out.println("No Such SubArray Found");
		}else {
			System.out.println("SubArray With Given Sum Exist From Index:"+start+" to "+end);
		}
		
		
	}

}
