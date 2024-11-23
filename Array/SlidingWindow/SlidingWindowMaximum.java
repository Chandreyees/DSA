package Array.SlidingWindow;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMaximum {
    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
//        int[] ans = maxSlidingWindow(nums,k);
//        System.out.println(Arrays.toString(ans));
//        System.out.println( max_of_subarrays(nums,k));

        //using Dequeue for further optimization
        System.out.println(Arrays.toString(maxSlidingWindowOptimized(nums,k)));

    }

    private static int[] maxSlidingWindowOptimized(int[] nums, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        Deque<Integer> deque = new LinkedList<>();
        for (int j = 0; j < nums.length; j++) {
            // Maintain decreasing order in Deque
            while (!deque.isEmpty() && nums[j] > deque.peekLast()) {
                deque.pollLast();
            }
            deque.addLast(nums[j]);

            // Slide the window when size matches k
            if (j >= k - 1) {
                ans.add(deque.peekFirst()); // Add the maximum to the result
                if (nums[j - k + 1] == deque.peekFirst()) {
                    deque.pollFirst(); // Remove the front if it is leaving the window
                }
            }
        }

        return ans.stream().mapToInt(Integer::intValue).toArray();
    }

    private static ArrayList<Integer> max_of_subarrays(int[] nums, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int i=0,j=0;j<nums.length;j++){
            if(j-i==k){
                ans.add(max);
                if(max<=nums[i]){
                    max=nums[++i];
                    for(int x=i+1;x<j;x++){
                        max=Math.max(max,nums[x]);
                    }
                }
                else
                    i++;
            }
            max=Math.max(max,nums[j]);
        }
        ans.add(max);
        return ans;
    }

    private static int[] maxSlidingWindow(int[] nums, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0,j=0;j<nums.length;j++){
            if(j-i==k){
                i++;
            }
            if (j-i+1==k) {
                ans.add(findMax(nums,i,j));
            }
        }
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }

    private static int findMax(int[] nums, int k, int j) {
        int max = Integer.MIN_VALUE;
        for(int i=k;i<=j;i++){
            max = Math.max(max,nums[i]);
        }
        return max;
    }
}
