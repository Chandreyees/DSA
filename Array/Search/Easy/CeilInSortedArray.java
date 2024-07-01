package Array.Search.Easy;

import java.util.Scanner;

public class CeilInSortedArray {
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
        System.out.println(findCeilValue(ar,n,key));
    }

    private static int findCeilValue(int[] ar, int n, int key) {
        int low=0,high=n-1,ans=-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(ar[mid]>key){
                ans = mid;
                high = mid-1;
            }
            else
               low = mid +1;
        }
        return ans;
    }
}
