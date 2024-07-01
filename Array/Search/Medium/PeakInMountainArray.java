package Array.Search.Medium;

import java.util.Scanner;

public class PeakInMountainArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n = sc.nextInt();
        int ar[] = new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++)
            ar[i]=sc.nextInt();
        System.out.println("Index is : "+findPeakIndex(ar,n));
    }

    public static int findPeakIndex(int[] ar, int n) {
        int low=0,high=n-1;
        int peak =0;
        while(low<high){
            int mid=(low+high)/2;
           if(ar[mid]>ar[mid+1]){
               high=mid;
           }
           else if(ar[mid]<ar[mid+1]){
               low=mid+1;
               peak = low;
           }
        }
        return peak;
    }
}
