package Recursion.basics;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the digit: ");
        int n = sc.nextInt();
        System.out.println("Sum of digits : "+sumOfDigits(n));
        int length = (int)(Math.floor(Math.log10(n)))+1;
        System.out.println("Reversed digit: "+reverseDigit(n,length));
    }

    private static int reverseDigit(int n,int count) {
        if(n%10==n)
            return n;
        return n%10*((int)Math.pow(10,count-1))+reverseDigit(n/10,count-1);
    }

    private static int sumOfDigits(int n) {
        if(n==0)
            return n;
       return sumOfDigits(n/10)+n%10;
    }
}
