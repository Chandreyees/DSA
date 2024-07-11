package Recursion.basics;

import java.util.Scanner;

public class CountNoOfZeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("No of zeroes : "+countZeroes(n,0));
    }

    private static int countZeroes(int n, int count) {
        if(n==0)
            return count;
        if((n%10)==0)
            count++;
        return countZeroes(n/10,count);
    }
}
