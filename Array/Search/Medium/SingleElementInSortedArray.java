package Array.Search.Medium;

import java.util.Scanner;

public class SingleElementInSortedArray {
//[3,3,7,7,10,11,11]
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n = sc.nextInt();
        int ar[] = new int[n];
        System.out.print("Enter the elements: ");
        for(int i=0;i<n;i++)
            ar[i]=sc.nextInt();
        System.out.println("The single element is : "+findSingleElement(ar));
    }

    private static int findSingleElement(int[] ar) {
        int n=ar.length;
        if(n==1)
            return ar[0];
        if(ar[0]!=ar[1])
            return ar[0];
        if(ar[n-1]!=ar[n-2])
            return ar[n-1];
        int low=1,high=n-2;
        while(low<=high){
            int mid = (low+high)/2;
            if(ar[mid]<ar[mid+1] && ar[mid]>ar[mid-1])
                return ar[mid];
            else if((mid%2==0 && ar[mid]==ar[mid+1]) || (mid%2==1 && ar[mid]==ar[mid-1]))
                low=mid+1;
            else
                high=mid-1;
        }
        return -1;
    }
}
