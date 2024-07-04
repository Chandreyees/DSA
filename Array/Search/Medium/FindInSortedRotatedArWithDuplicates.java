package Array.Search.Medium;

import java.util.Arrays;
import java.util.Scanner;

import static Array.Easy.RotateArrayByK.rotateArray;
import static Array.Search.BinarySearchIterative.binarySearchIterativeIncreasing;

public class FindInSortedRotatedArWithDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n = sc.nextInt();
        int ar[] = new int[n];
        System.out.print("Enter the elements: ");
        for(int i=0;i<n;i++)
            ar[i]=sc.nextInt();
        System.out.println("Enter the key: ");
        int key = sc.nextInt();
        /*System.out.println("Enter the rotation number: ");
        int d = sc.nextInt();
        Arrays.sort(ar);
        rotateArray(ar,d);*/
        System.out.println("Index is : "+findIndex(ar,key));
    }

    private static boolean findIndex(int[] ar, int key) {
        if(ar.length==1 && ar[0]==key)
            return true;
        int pivot = findPivot(ar,ar.length);
        boolean ans = binarySearch(ar,0,pivot,key);
        if(!ans)
            return binarySearch(ar,pivot+1,ar.length-1,key);
        return ans;
    }

    private static int findPivot(int[] arr, int length) {
        int start = 0;
        int end = length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }

            // if elements at middle, start, end are equal then just skip the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // skip the duplicates
                // NOTE: what if these elements at start and end were the pivot??
                // check if start is pivot
                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                // check whether end is pivot
                if (end > start && arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            // left side is sorted, so pivot should be in right
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    private static boolean binarySearch(int[] ar,int low, int high, int key){
        while(low<=high){
            int mid=(low+high)/2;
            if(ar[mid]==key)
                return true;
            else if(ar[mid]<key)
                low=mid+1;
            else
                high=mid-1;
        }
        return false;
    }
}
