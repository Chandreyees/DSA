package Recursion.basics;

import java.util.Scanner;

public class RemoveLetterFromAString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();
        System.out.println("Enter the letter you wanna remove: ");
        String letter = sc.nextLine();
        System.out.println("New String: "+removeLetter(s,letter));
    }

    private static String removeLetter(String str, String letter) {
       if(str.isEmpty())
           return "";
        if(str.substring(0,1).equalsIgnoreCase(letter))
            return removeLetter(str.substring(1),letter);
        else
            return str.substring(0,1) + removeLetter(str.substring(1),letter);
    }
}
