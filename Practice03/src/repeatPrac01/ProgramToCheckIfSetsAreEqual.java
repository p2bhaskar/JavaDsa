package repeatPrac01;

import java.util.HashSet;
import java.util.Set;

public class ProgramToCheckIfSetsAreEqual {

	public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();

        // Adding elements to set1
        set1.add("apple");
        set1.add("cherry");
        set1.add("banana");

        // Adding elements to set2
       set2.add("banana");
        set2.add("cherry");
        set2.add("apple");

        // Check if sets are equal
        boolean areEqual = areSetsEqual(set1, set2);

        // Print the result
        if (areEqual) {
            System.out.println("The sets are equal.");
        } else {
            System.out.println("The sets are not equal.");
        }
    }

    private static <T> boolean areSetsEqual(Set<T> set1, Set<T> set2) {
        // Check if both sets have the same size
        if (set1.size() != set2.size()) {
            return false;
        }

        // Check if set1 contains all elements of set2
        return set1.containsAll(set2);
    }
}
