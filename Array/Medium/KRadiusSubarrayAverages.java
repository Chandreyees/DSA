package Array.Medium;

import java.util.Arrays;

public class KRadiusSubarrayAverages {

    public static void main(String[] args) {
        int[] nums = {7,4,3,9,1,8,5,2,6};
        System.out.println(Arrays.toString(getAverages(nums,3)));
    }

    public static int[] getAverages(int[] nums, int k) {
        int len = k*2+1;
        if(nums.length==1 && k==0)
            return nums;
        int[] ans = new int[nums.length];
        Arrays.fill(ans,-1);
        if(k>=nums.length || len>nums.length)
            return ans;
        long window = 0;
        int left = 0;
        int avg = 0;
        int index = k;
        for(int i=0;i<nums.length;i++){
            window+=nums[i];
            while(i-left+1>len){
                ans[index++] = avg;
                window-=nums[left];
                left++;
            }
            avg = (int) window/len;
        }
        return ans;
    }
}
