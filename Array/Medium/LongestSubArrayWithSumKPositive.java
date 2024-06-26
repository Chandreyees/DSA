package Array.Medium;

import java.util.HashMap;
import java.util.Scanner;

public class LongestSubArrayWithSumKPositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n = sc.nextInt();
        int ar[] = new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++)
            ar[i]=sc.nextInt();
        System.out.println("Enter the K value:");
        int k = sc.nextInt();
        System.out.println("Longest sub array length with sum = "+k+" is : "+findLongestSubArrayLength(ar,n,k));
    }

    //brute force
   /* private static int findLongestSubArrayLength(int[] ar, int n, int k) {
        int max=0,count=1,sum=0;
        for(int i=0;i<n-1;i++){
            sum=ar[i];
            for(int j=i+1;j<n;j++){
                sum+=ar[j];
                count+=1;
                if(sum==k){
                    if(max<count)
                        max=count;
                    break;
                }
                if(sum>k)
                    break;
            }
            count=1;
        }
        return max;
    }*/

    //better approach (hashing)
    /*private static int findLongestSubArrayLength(int[] ar, int n, int k) {
        int max=0,sum=0;
        HashMap<Integer,Integer> preSumMap = new HashMap<>();
        for(int i=0;i<n;i++){
            sum+=ar[i];
            if(sum==k)
                max=Math.max(max,i+1);
            int remaining = sum - k;
            if(preSumMap.containsKey(remaining)){
                int len = i-preSumMap.get(remaining);
                max=Math.max(max,len);
            }
            if(!preSumMap.containsKey(sum)){
                preSumMap.put(sum,i);
            }
        }
        return max;
    }*/

    //optimal approach (two pointer)
    private static int findLongestSubArrayLength(int[] ar, int n, int k){
        int left=0,sum=ar[0],maxLength=0, right=0;
        while(right<n){
            while(left<=right && sum>k){
                sum-=ar[left];
                left++;
            }
            if(sum==k){
                maxLength=Math.max(maxLength,right-left+1);
            }
            right++;
            if(right<n){
                sum+=ar[right];
            }
        }
        return maxLength;
    }
}
