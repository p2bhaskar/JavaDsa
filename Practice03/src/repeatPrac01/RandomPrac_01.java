package repeatPrac01;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class RandomPrac_01 {

	public static void main(String[] args)
	{
		//Set<Integer> set = new TreeSet<>();
		
		// Set<Integer> set = new HashSet<>();
		
		 Set<Integer> set = new LinkedHashSet<>();
		
		
		
		set.add(6);
		set.add(3);
		set.add(100);
		set.add(70);
		
		System.out.println(set);
	}

}
