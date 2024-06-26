package Array.Medium;

import java.util.Scanner;

public class MajorityElementOptimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n = sc.nextInt();
        int ar[] = new int[n];
        System.out.println("Enter the elements : ");
        for(int i=0;i<n;i++)
            ar[i]=sc.nextInt();
        System.out.println("Majority Element is :  "+ majorityElement(ar,n));
    }

    //optimal approach
    private static int majorityElement(int[] ar, int n){
        int count=0;
        int element = ar[0];
        for(int i=0;i<n-1;i++){
            if(ar[i]==element)
                count++;
            else if(ar[i]!=element)
                count--;
            if(count==0)
                element=ar[i+1];

        }
        return element;
    }
}
