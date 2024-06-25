package Array.Easy;

import java.util.Scanner;

public class LongestSubArrayWithSumK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n = sc.nextInt();
        int ar[] = new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++)
            ar[i]=sc.nextInt();
        System.out.println("Enter the target: ");
        int k = sc.nextInt();
        System.out.println(findLongestSubArrayLength(ar,n,k));
    }

    //brute force
   /* private static int findLongestSubArrayLength(int[] ar, int n, int k) {
        int max=0,count=1,sum=0;
        for(int i=0;i<n-1;i++){
            sum=ar[i];
            for(int j=i+1;j<n;j++){
                sum+=ar[j];
                count+=1;
                if(sum==k){
                    if(max<count)
                        max=count;
                    break;
                }
                if(sum>k)
                    break;
            }
            count=1;
        }
        return max;
    }*/

    //better approach
    private static int findLongestSubArrayLength(int[] ar, int n, int k){
        int max=0;
        return max;
    }
}
