package pckg_01;

import java.util.HashMap;
import java.util.Map;

public class ZeroSumSubarray
{
    public static void main(String[] args)
    {
        int[] arr = {12, -2, 4, -8, -2, -4, 10, 15, -16};

        int sum = 0;
        Map<Integer, Integer> sumMap = new HashMap<>();

        int start = -1; // starting index of zero-sum subarray
        int end = -1; // ending index of zero-sum subarray

        for (int i = 0; i < arr.length; i++)
        {
            sum += arr[i];

            // If sum is 0, it means we found a zero-sum subarray
            if (sum == 0)
            {
                start = 0; // Update start index
                end = i;   // Update end index
                break;
            }

            // If the sum is encountered before, it means the subarray between indices
            // sumMap.get(sum) + 1 and i has a sum of 0
            if (sumMap.containsKey(sum))
            {
                start = sumMap.get(sum) + 1;
                end = i;
                break;
            }

            // Store the current sum along with its index in the map
            sumMap.put(sum, i);
        }

        if (start != -1 && end != -1)
        {
            System.out.print("Zero-sum subarray is [ ");
            for (int i = start; i <= end; i++)
            {
                System.out.print(arr[i] + " ");
            }
            System.out.print("] ");
        } else
        {
            System.out.println("No zero-sum subarray found.");
        }
    }
}
