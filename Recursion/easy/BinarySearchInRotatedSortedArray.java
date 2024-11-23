package Recursion.easy;

import java.util.Scanner;

public class BinarySearchInRotatedSortedArray {
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

    private static int search(int[] arr, int low, int high, int key) {
        if(low>high)
            return -1;
        int mid = (low+high)/2;
        if(arr[mid]==key)
            return mid;

        if(arr[low]<=arr[mid])
        {
            if(key>=arr[low] && key<=arr[mid])
                return search(arr,low,mid-1,key);
            else
                return search(arr,mid+1,high,key);
        }

        else if(key>=arr[mid] && key<=arr[high])
            return search(arr,mid+1,high,key);
        else
            return search(arr,low,mid-1,key);

    }
}
