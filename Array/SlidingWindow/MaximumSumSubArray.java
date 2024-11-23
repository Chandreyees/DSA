package Array.SlidingWindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class MaximumSumSubArray {
    public static void main(String[] args) {
        int[] ar={5,3,3,1,1};
        int k = 3;
        long ans = maximumSubarraySum(ar,k);
        System.out.println(ans);
    }

    public static long maximumSubarraySum(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        long sum = 0;
        long maxSum = 0;
        for(int i=0,j=0;j<nums.length;j++){
            sum+=nums[j];
            while(set.contains(nums[j])){
                set.remove(nums[j]);
                sum-=nums[i];
                i++;
            }
            set.add(nums[j]);
            if(set.size()==k){
                maxSum = Math.max(sum,maxSum);
                set.remove(nums[i]);
                sum-=nums[i];
                i++;
            }
        }
        return maxSum;
    }
}
