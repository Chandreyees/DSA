package Array.Search.Medium;

import java.util.Arrays;
import java.util.Scanner;

public class OccurancesInSortedArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n = sc.nextInt();
        int ar[] = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++)
            ar[i] = sc.nextInt();
        System.out.println("Enter the key: ");
        int key = sc.nextInt();
        System.out.println("Occurence is : " + findOccurenceInSortedArray(ar, n, key));
    }

    //brute force
   /* private static int findOccurenceInSortedArray(int[] ar, int n, int key) {
        int count =0;
        for(int i:ar){
            if(i==key)
            count++;
        }
        return count;
    }*/

    //optimal sol
    private static int findOccurenceInSortedArray(int[] ar, int n, int key) {
        int low = 0, high = n - 1;
        int first = -1, last = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (ar[mid] == key) {
                first = mid;
                high = mid - 1;
            } else if (ar[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }
        low = 0;
        high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (ar[mid] == key) {
                last = mid;
                low = mid + 1;
            } else if (ar[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }
        if(first==-1)
            return 0;
        return (last - first) + 1;
    }
}
