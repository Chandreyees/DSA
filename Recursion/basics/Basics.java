package Recursion.basics;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the nth term: ");
        int n = sc.nextInt();
        nToOne(n);
        System.out.println();
        oneToN(n);
        System.out.println("\n"+factorial(n));
    }

    private static int factorial(int n) {
      if(n==1)
          return 1;
      return n*factorial(n-1);

    }

    private static void oneToN(int n) {
        if(n==0)
            return;
        oneToN(n-1);
        System.out.print(""+n+" ");
    }

    private static void nToOne(int n) {
        if(n==0)
            return;
        System.out.print(""+n+" ");
        nToOne(n-1);
    }
}
