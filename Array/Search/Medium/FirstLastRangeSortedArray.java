package Array.Search.Medium;

import java.util.Arrays;
import java.util.Scanner;

public class FirstLastRangeSortedArray {

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
        System.out.println("Index Range is : "+ Arrays.toString(searchIndex(ar,n,key)));
    }

    //optimal way
    private static int[] searchIndex(int[] ar, int n, int key) {
        int low=0,high=n-1;
        int first=-1,last=-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(ar[mid]==key){
                first=mid;
                high=mid-1;
            }
            else if(ar[mid]<key)
                low=mid+1;
            else
                high=mid-1;
        }
        low=0;high=n-1;
        while(low<high){
            int mid=(high+low)/2;
            if(ar[mid]==key){
                last=mid;
                low=mid+1;
            } else if (ar[mid]>key) {
                high=mid-1;
            }
            else
                low=mid+1;
        }
        return new int[]{first,last};
    }

    //better approach
    /*private static int[] searchIndex(int[] ar, int n, int key){
        int first=-1,last=-1;
        int low = 0, high = n-1;
        int ans[] = {first,last};
        while(low<=high){
            int mid = (low+high)/2;
            if(ar[mid]<key){
                low=mid+1;
            }
            else if(ar[mid]==key){
                first=mid;last=mid;
                while (first > 0 && ar[first - 1] == key) {
                    first--;
                }
                while (last < n - 1 && ar[last + 1] == key) {
                    last++;
                }
                ans[0] = first;
                ans[1] = last;
                return ans;
            }
            else
                high=mid-1;
        }
        return ans;
    }
*/
}
