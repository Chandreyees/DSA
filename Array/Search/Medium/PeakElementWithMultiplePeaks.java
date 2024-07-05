package Array.Search.Medium;

import java.util.Scanner;

//https://leetcode.com/problems/find-peak-element/description/
public class PeakElementWithMultiplePeaks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n = sc.nextInt();
        int ar[] = new int[n];
        System.out.print("Enter the elements: ");
        for(int i=0;i<n;i++)
            ar[i]=sc.nextInt();
        System.out.println("The single element is : "+findSinglePeak(ar));
    }

    private static int findSinglePeak(int[] ar) {
        int n=ar.length;
        if(n==1)
            return ar[0];
        int low=0,high=n-1;
        int peak=0;
        while(low<=high){
            int mid = (low+high)/2;
            if(mid<n-1 && mid>0 && ar[mid]>ar[mid+1] && ar[mid]>ar[mid-1])
                return mid;
            if(mid<high && ar[mid]>ar[mid-1]) {
                low = mid+1;
            }
            else
                high = mid-1;
        }
        return -1;
    }
}
