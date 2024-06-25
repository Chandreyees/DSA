package Array.Easy;

import java.util.Scanner;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n = sc.nextInt();
        int ar[] = new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++)
            ar[i]=sc.nextInt();
        System.out.println(findMaxConsecutiveOnes(ar,n));
    }

    private static int findMaxConsecutiveOnes(int[] ar, int n) {
        int max = 0,count =0;
        for(int i=0;i<n;i++){
            if(ar[i]==0){
                if(max<count)
                    max=count;
                count = 0;
            }
            count+=ar[i];
        }
        if(max<count)
            max = count;
        return max;
    }
}
