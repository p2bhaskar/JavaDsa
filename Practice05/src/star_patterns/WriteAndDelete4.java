package star_patterns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WriteAndDelete4 {
	public static void main(String[] args) {
	 int[] arr = {24,36,-16,9,0,4,3,21,-100,-10,200};
	 //int[] arrnew = new int[arr.length-1];
	 
	 // List<Integer> al1 = new ArrayList<>();
	 
	 List<Integer> al = Arrays.asList(78,89,45,21,34,0,-1);
	 
	 //Collections.reverse(al);
	 //Collections.sort(al,Collections.reverseOrder());
	 //Collections.rotate(al, 3);
	 //For example, suppose list comprises [t, a, n, k, s].
	 //After invoking Collections.rotate(list, 1) 
	 //(or Collections.rotate(list, -4)),
	 //list will comprise [s, t, a, n, k]. 
	 //System.out.println(al);//[34, 0, -1, 78, 89, 45, 21]
	 
	 Collections.replaceAll(al,78,45);//replaces 78 with 45
	 System.out.println(al);
		
		

	}

}
