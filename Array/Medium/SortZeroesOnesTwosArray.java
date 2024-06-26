package Array.Medium;

import java.util.Arrays;
import java.util.Scanner;

public class SortZeroesOnesTwosArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n = sc.nextInt();
        int ar[] = new int[n];
        System.out.println("Enter the elements within 0s,1s and 2s: ");
        for(int i=0;i<n;i++)
            ar[i]=sc.nextInt();
        System.out.println("After sorting :  "+ Arrays.toString(sortArray(ar,n)));
    }

    //better approach using counter
    /*private static int[] sortArray(int[] ar, int n) {
        int zeroCount=0,oneCount=0,twoCount=0,i=0;
        for(int num:ar){
            if(num==0)
                zeroCount++;
            if(num==1)
                oneCount++;
            if(num==2)
                twoCount++;
        }
        for(;i<zeroCount;i++){
            ar[i]=0;
        }
        int j=i;
        while(oneCount>0){
            ar[j]=1;
            j++;
            oneCount--;
        }
        int k=j;
        while(twoCount>0){
            ar[k]=2;
            k++;
            twoCount--;
        }
        return ar;
    }*/

    //optimal approach (three pointer algo)
    private static int[] sortArray(int[] ar, int n){
        int low=0,mid=0,high=n-1;
         while(mid<high){
             if(ar[mid]==0){
                 swapArray(ar,mid,low);
                 low++;mid++;
             }
             else if(ar[mid]==1)
                 mid++;
             else if(ar[mid]==2){
                 swapArray(ar,mid,high);
                 high--;
             }
         }
        return ar;
    }

    private static void swapArray(int[] ar, int low, int high) {
        int temp=ar[low];
        ar[low]=ar[high];
        ar[high]=temp;
    }
}
