package Basics;

import java.util.Scanner;

public class Pattern7 {
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
    }
}
