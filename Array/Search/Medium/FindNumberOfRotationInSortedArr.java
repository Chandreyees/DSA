package Array.Search.Medium;

import java.util.Scanner;



public class FindNumberOfRotationInSortedArr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n = sc.nextInt();
        int ar[] = new int[n];
        System.out.print("Enter the elements: ");
        for(int i=0;i<n;i++)
            ar[i]=sc.nextInt();
        System.out.println("Number of rotation is : "+findRotationNumber(ar));
    }

    private static int findRotationNumber(int[] ar) {
        if(ar.length==1)
            return 1;
        int smallestNumberIndex = findPivot(ar,ar.length)+1;
        if(smallestNumberIndex==0)
            return ar.length;
        else
            return smallestNumberIndex;
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
