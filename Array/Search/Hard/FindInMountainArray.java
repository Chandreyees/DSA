package Array.Search.Hard;

import Array.Search.BinarySearchIterative;

import java.util.Scanner;

import static Array.Search.BinarySearchIterative.*;
import static Array.Search.Medium.PeakInMountainArray.findPeakIndex;

public class FindInMountainArray {
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
        System.out.println("Index is : "+findIndex(ar,key));
    }

    private static int findIndex(int[] ar, int key) {
        int peak = findPeakIndex(ar,ar.length);
        int ans = binarySearchIterativeIncreasing(ar,0,peak,key);
        if(ans!=-1)
            return ans;
        else
           return binarySearchIterativeDecreasing(ar,peak,ar.length-1,key);
    }
}
