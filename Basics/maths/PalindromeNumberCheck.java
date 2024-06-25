package Basics.maths;

import java.util.Scanner;

import static Basics.maths.ReverseNumber.reverseNumber;

public class PalindromeNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digit: ");
        int number = sc.nextInt();
        int reverse = reverseNumber(number);
        if(reverse==number)
            System.out.println("It is a Palindrome Number");
        else
            System.out.println("Not a Palindrome Number");
    }
}
