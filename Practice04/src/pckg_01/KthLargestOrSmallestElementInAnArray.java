package pckg_01;

import java.util.Arrays;

public class KthLargestOrSmallestElementInAnArray {
      public static void main(String[] args) 
      {
		 int[] arr = {23,45,-67,89,12,45,39,-100};
		 
		  Arrays.sort(arr);
		  
		 int fourThLargestEle = arr[arr.length-4];
		 
		 int fourThSmallestEle = arr[3];
		  
		 System.out.println(fourThLargestEle);//39
		 System.out.println(fourThSmallestEle);//23
		 
	  }
}
