package arrays;

import java.util.HashSet;

public class FirstRepeatingElement 
{
	public static void main(String[] args) 
	{
		int[] arr = {23,43,12,34,23,43,54};
		
		HashSet<Integer> set =new HashSet<>();
		
		for(int i:arr) {
			if(!set.add(i)) {
				System.out.println(i);
				break;
			}
		}
		
	}

}
