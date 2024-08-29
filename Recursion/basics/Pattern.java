package Recursion.basics;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//
        pattern2(n,1);
    }

    private static void pattern2(int n, int j) {
        if(n==0)
            return;
        if(j>n) {
            pattern2(n-1,1);
            System.out.println();
        }
        if(j<=n){
            pattern2(n,j+1);
            System.out.print("*"+" ");
        }
    }

    private static void pattern1(int n, int j) {
        if(n==0)
            return;
        if(j>n) {
            System.out.println();
            pattern1(n-1,1);
        }
        if(j<=n){
            System.out.print("*"+" ");
            pattern1(n,j+1);
        }
    }
}
