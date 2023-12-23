package prac_01;
import java.util.Arrays;

public class ArraysCopyOfExample {

    public static void main(String[] args) {
        // Example 1: Copy entire array
        int[] originalArray = {1, 2, 3, 4, 5};
        int[] copiedArray1 = Arrays.copyOf(originalArray, originalArray.length);

        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Copied Array 1: " + Arrays.toString(copiedArray1));

        // Example 2: Copy with a specified length
        int[] copiedArray2 = Arrays.copyOf(originalArray, 3);

        System.out.println("Copied Array 2: " + Arrays.toString(copiedArray2));

        // Example 3: Copy with a specified length, padding with zeros
        int[] copiedArray3 = Arrays.copyOf(originalArray, 7);

        System.out.println("Copied Array 3: " + Arrays.toString(copiedArray3));
        
     // Example 4: Copy with a length 0
        int[] copiedArray4 = Arrays.copyOf(originalArray, 0);

        System.out.println("Copied Array 4: " + Arrays.toString(copiedArray4));
        
    }
}
