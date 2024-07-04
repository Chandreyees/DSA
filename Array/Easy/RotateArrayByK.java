package Array.Easy;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArrayByK {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n = sc.nextInt();
        int ar[] = new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++)
            ar[i]=sc.nextInt();
        System.out.println("Enter the rotation number: ");
        int d = sc.nextInt();
        rotateArray(ar,d);
        System.out.println("After rotation array is : "+Arrays.toString(ar));
    }

    public static void rotateArray(int[] ar, int d) {
        int n=ar.length;
        reverseArray(ar,0,d-1);
        reverseArray(ar,d,n-1);
        reverseArray(ar,0,n-1);
    }

    private static void reverseArray(int[] ar, int i, int n) {
       while(i<n){
           int temp=ar[i];
           ar[i]=ar[n];
           ar[n]=temp;
           i++;n--;
       }
    }
}
