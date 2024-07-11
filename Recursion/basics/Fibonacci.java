package Recursion.basics;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the nth term: ");
        int n = sc.nextInt();
        System.out.println(fib(n));
    }

    private static int fib(int n) {
        if(n<2)
            return n;
        return fib(n-1)+fib(n-2);
    }
}
