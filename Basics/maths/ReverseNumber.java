package Basics.maths;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a digit: ");
        int n = sc.nextInt();
        int ans = reverseNumber(n);

        System.out.println("Result: "+ans);
    }

   public static int reverseNumber(int n) {
        int k=0;
        while(n>0){
            int a = n%10;
            k= k*10+a;
            n=n/10;
        }
        return k;
    }
}
