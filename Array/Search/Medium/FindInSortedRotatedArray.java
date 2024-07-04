package Array.Search.Medium;

import java.util.Arrays;
import java.util.Scanner;

import static Array.Easy.RotateArrayByK.rotateArray;
import static Array.Search.BinarySearchIterative.binarySearchIterativeDecreasing;
import static Array.Search.BinarySearchIterative.binarySearchIterativeIncreasing;
import static Array.Search.Medium.PeakInMountainArray.findPeakIndex;

public class FindInSortedRotatedArray {

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
        System.out.println("Enter the rotation number: ");
        int d = sc.nextInt();
        Arrays.sort(ar);
        rotateArray(ar,d);
        System.out.println("Index is : "+findIndex(ar,key));
    }

    private static int findIndex(int[] ar, int key) {
        if(ar.length==1 && ar[0]==key)
            return 0;
     int pivot = findPivot(ar,ar.length);
     int ans = binarySearchIterativeIncreasing(ar,0,pivot,key);
     if(ans==-1)
         return binarySearchIterativeIncreasing(ar,pivot+1,ar.length-1,key);
     return ans;
    }

    private static int findPivot(int[] ar, int length) {
        int low = 0, high=length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(mid<high && ar[mid]>ar[mid+1])
                return mid;
            else if(mid>low && ar[mid]<ar[mid-1])
                return mid-1;
            else if(ar[low]>=ar[mid])
                high=mid-1;
            else
                low=mid+1;
        }
        return -1;
    }
}
