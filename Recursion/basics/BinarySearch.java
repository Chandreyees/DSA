package Recursion.basics;

import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the nth length of array: ");
        int n = sc.nextInt();
        int ar[] = new int[n];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<n;i++)
            ar[i]= sc.nextInt();
        System.out.println("Enter the key: ");
        int key = sc.nextInt();
        System.out.println(search(ar,0,n-1,key));
    }

    private static int search(int[] ar, int low, int high, int key) {
        if(low>high)
            return -1;
        int mid = (low+(high-low))/2;
        if(ar[mid]==key)
            return mid;
        if(ar[mid]>key)
            return search(ar,low,mid-1,key);
        return search(ar,mid+1,high,key);
    }
}
