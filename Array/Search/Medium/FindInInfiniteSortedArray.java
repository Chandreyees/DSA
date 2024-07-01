package Array.Search.Medium;

import java.util.Arrays;
import java.util.Scanner;

public class FindInInfiniteSortedArray {

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
        if(ar[0]==key)
            return 0;
        int low=0,high=1;
        try
        {
            while(ar[high]<key){
                int size=(high-low)+1;
                low=high+1;
                high+=size*2;
            }
        }
        catch (Exception e){
            return -1;
        }


        return searchKey(low,high,ar,key);
    }

    private static int searchKey(int low,int high,int[] ar, int key) {
        while(low<=high){
            int mid = (low+high)/2;
            if(ar[mid]<key)
                low=mid+1;
            else if(ar[mid]==key)
                return mid;
            else
                high=mid-1;
        }
        return 0;
    }
}
