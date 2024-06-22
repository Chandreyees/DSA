package Basics;

import java.util.Scanner;

public class Pattern9 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter the limit");
       int n = sc.nextInt();
       for(int i=1;i<=n;i++){
        for(int j=1;j<=n+i-1;j++)
           if(j>=n-i+1)
           System.out.print("*"+" ");
           else
           System.out.print(" "+" ");
        System.out.println();
       }
       for(int i=1;i<=n;i++){
        for(int j=1;j<=2*n-i;j++)
           if(j<i)
           System.out.print(" "+" ");
           else
           System.out.print("*"+" ");
        System.out.println();
       }
    }
}
