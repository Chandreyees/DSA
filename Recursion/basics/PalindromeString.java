package Recursion.basics;

import java.util.Scanner;

public class PalindromeString {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String rev = reverseWord(word,word.length());
        if(rev.equalsIgnoreCase(word))
            System.out.println("YES");
        else
            System.out.println("NO");
    }

    private static String reverseWord(String word,int length) {
        if(length==0)
            return word;
        return word.charAt(length-1)+reverseWord(word.substring(0,length-1),length-1);
    }
}
