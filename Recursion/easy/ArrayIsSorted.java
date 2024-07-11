package Recursion.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayIsSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int n = sc.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++)
            ar[i] = sc.nextInt();
      //  System.out.println(checkIfArrayIsSorted(ar, ar.length));
        System.out.println("Enter the key you want to search: ");
        int key = sc.nextInt();
        if(searchInArray(ar,ar.length,key)) {
            System.out.println("The key is present at "+findAllIndexOfKey(ar, ar.length, key)+"th index");
        }
        else
            System.out.println("Key is not present");
    }

    private static int findIndexOfKey(int[] ar, int n, int key) {
        if(n==0)
            return -1;
        if(ar[n-1]==key)
            return n-1;
        return findIndexOfKey(ar,n-1,key);
    }

    private static ArrayList<Integer> findAllIndexOfKey(int[] ar, int n, int key) {
        ArrayList<Integer> list = new ArrayList<>();
        if(n==0) {
            return list;
        }
        if(ar[n-1]==key)
            list.add(n-1);
        ArrayList<Integer> ansFromBelowCalls = findAllIndexOfKey(ar, n - 1, key);
        list.addAll(ansFromBelowCalls);
        return list;

    }

    private static boolean searchInArray(int[] ar, int n, int key) {
        if(n==0)
            return false;
       /* if(ar[n-1]==key)
            return true;*/
        return ar[n-1]==key || searchInArray(ar,n-1,key);
    }

    private static boolean checkIfArrayIsSorted(int[] ar, int length) {
        if(length==1)
            return true;
        /*if(ar[length-1]<ar[length-2])
            return false;*/
        return ar[length-1]>ar[length-2] && checkIfArrayIsSorted(ar,length-1);
    }
}
