package arrayEasy.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in array1: ");
        int m = sc.nextInt();
        System.out.println("Enter the number of elements in array2: ");
        int n = sc.nextInt();
        int arr1[] = new int[n+m];
        int arr2[] = new int[m];
        System.out.print("Enter the elements for array1: ");
        for(int i =0; i<m; i++)
            arr1[i] = sc.nextInt();
        System.out.print("Enter the elements for array2: ");
        for(int i =0; i<n; i++)
            arr2[i] = sc.nextInt();
        System.out.println("Original arr1 ="+Arrays.toString(arr1)+"\n Original Array2 = "+Arrays.toString(arr2));
        MergeTwoSortedArray ob = new MergeTwoSortedArray();
        ob.merge(arr1,m,arr2,n);
        System.out.println(Arrays.toString(arr1));
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = m+n-1, i=m-1,j=n-1;
        while(j>=0){
            if(i>=0 && nums1[i]>nums2[j])
                nums1[k--] = nums1[i--];
            else
                nums1[k--] = nums2[j--];
        }

    }
}
