package Array.SlidingWindow;

import java.util.HashMap;

public class LargestSubArrayOfSumK {
    public static void main(String[] args) {
       /* int[] arr = {10, 5, 2, 7, 1, 9};
        int k =15;
        System.out.println(findSubArrayWithSumForPositiveNumbers(arr,k));*/
        int[] arr2 = {1, -1, 5, -2, 1};
        int k2 = 3;
        System.out.println(findSubArrayWithSum(arr2,k2));
    }

    private static int findSubArrayWithSum(int[] ar, int k) {
        int n = ar.length;
        int max = 0, sum = 0;
        HashMap<Integer, Integer> preSumMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            sum += ar[i];

            // Case 1: If the sum equals k, update max with the current length
            if (sum == k) {
                max = Math.max(max, i + 1);
            }

            // Case 2: Check if a subarray exists with a sum that is `sum - k`
            int remaining = sum - k;
            if (preSumMap.containsKey(remaining)) {
                int len = i - preSumMap.get(remaining);
                max = Math.max(max, len);
            }

            // Case 3: If the current sum is not already in the map, add it
            // This ensures the smallest index is stored for the sum
            preSumMap.putIfAbsent(sum, i);
        }
        return max;
    }

    private static int findSubArrayWithSumForPositiveNumbers(int[] arr, int k) {
        int count = 0;
        int sum = 0;
        for(int i=0,j=0;j<arr.length;j++){
            sum+=arr[j];
            if(sum==k){
                count=Math.max(count,j-i+1);
                sum-=arr[i];
                i++;
            }
            while(sum>k){
                sum-=arr[i];
                i++;
            }
        }
        return count;
    }


}
