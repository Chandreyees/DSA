package Array.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class MissingNumberInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n = sc.nextInt();
        int ar[] = new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++)
            ar[i]=sc.nextInt();
        int result = findMissingNumber(ar,n);
        System.out.println(result);
    }

    //bruteForceApproach
   /* private static int findMissingNumber(int[] ar, int n){
        int temp[] = new int[n+1];
        int count = 0;
        for(int i=0;i<n+1;i++) {
            temp[i] = count;
            count++;
        }
        boolean check = false;
        for(int j=0;j<n+1;j++){
            int searchNumber = temp[j];
            for(int i=0;i<n;i++){
                if(searchNumber== ar[i])
                    check = true;
            }
            if(check == false)
                return searchNumber;
        }
        return -1;
    }*/

    //better approach
   /* private static int findMissingNumber(int[] ar, int n){
        int temp[] = new int[n+1];
        for(int i:ar)
            temp[i]++;
        for(int i=0;i<n+1;i++){
            if(temp[i]==0)
                return i;
        }
        return -1;
    }*/

    //optimal sol using sort
   /* private static int findMissingNumber(int[] ar, int n){
        Arrays.sort(ar);
        for(int i=0;i<n;i++){
            if(ar[i]!=i)
                return i;
        }
        return -1;
    }*/

    //optimal approach using summation
   /* private static int findMissingNumber(int[] ar, int n){
        int expectedSum = (n*(n+1))/2;
        int actualSum = 0;
        for(int x:ar)
            actualSum+=x;
        return expectedSum-actualSum;
    }*/

    //optimal approach using xor
    private static int findMissingNumber(int[] ar, int n){
        int xor1 = 0, xor2 =0;
        for(int k=1;k<=n;k++)
            xor1=xor1^k;
        for(int x:ar)
            xor2 = xor2^x;
        return xor1^xor2;
    }
}
