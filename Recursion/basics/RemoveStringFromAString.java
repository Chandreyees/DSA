package Recursion.basics;

import java.util.Scanner;

public class RemoveStringFromAString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();
        System.out.println("Enter the letter you wanna remove: ");
        String letter = sc.nextLine();
        //System.out.println("New String: "+removeLetter(s,letter));
        System.out.println("New String: "+removeString(s,letter));
    }

    private static String removeString(String str, String word) {
        if(str.length()<0)
            return "";
        if(str.indexOf(" ")==-1)
        {
            return (str.equalsIgnoreCase(word))?"":str;
        }
        String check = str.substring(0,str.indexOf(" "));
        if(check.equalsIgnoreCase(word))
            return removeString(str.substring(str.indexOf(" ")+1),word);
        else
            return check+" "+removeString(str.substring(str.indexOf(" ")+1),word);
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
