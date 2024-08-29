package Recursion.basics;

import java.util.Arrays;
import java.util.Scanner;

import static Basics.SwapElements.swap;
import static Recursion.basics.MergeSort.mergeSort;
import static Recursion.basics.QuickSort.quickSort;

public class ArraySorting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n = sc.nextInt();
        int ar[] = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++)
            ar[i] = sc.nextInt();
        System.out.println("Original Array: " + Arrays.toString(ar));
        System.out.println();
//        System.out.println("Bubble Sorted Array: "+ Arrays.toString(bubbleSort(ar,0,n)));
//        System.out.println("Selection Sorted Array"+ Arrays.toString(selectionSort(ar,0,n,0)));
//        mergeSort(ar, 0, n - 1);
//       System.out.println("Merge Sorted Array" + Arrays.toString(ar));
        quickSort(ar,0,n-1);
       System.out.println("Quick Sorted Array"+ Arrays.toString(ar));
    }

    private static int[] selectionSort(int[] ar, int j, int n, int max) {
        if(n==0)
            return ar;
        if(j<n){
            if(ar[j]>ar[max])
                max=j;
            selectionSort(ar,j+1,n,max);
        }
        else {
            swap(ar,max,n-1);
            selectionSort(ar, 0, n - 1, 0);
        }
        return ar;
    }

    private static int[] bubbleSort(int[] ar, int i, int n) {
        if(n==0)
            return ar;
        if(i<n-1){
            if(ar[i]>ar[i+1])
                swap(ar,i,i+1);
            bubbleSort(ar,i+1,n);
        }
        else
            bubbleSort(ar,0,n-1);
        return ar;
    }
}
