package Array.Search.Easy;

import java.util.Scanner;

public class SearchInsertPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n = sc.nextInt();
        int ar[] = new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++)
            ar[i]=sc.nextInt();
        System.out.println("Enter the key: ");
        int key = sc.nextInt();
        System.out.println("Correct Index is : "+getCorrectIndex(ar,n,key));
    }

    private static int getCorrectIndex(int[] nums, int n, int target) {
        int low=0,high=nums.length-1,ans=-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]==target)
                return mid;
            else if(nums[mid]<target){
                ans=mid;
                low = mid+1;
            }
            else
                high = mid-1;
        }
        return ans+1;
    }
}
