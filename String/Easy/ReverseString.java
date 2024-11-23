package String.Easy;

import java.util.Scanner;

public class ReverseString {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String ans = reverseStringWordWise(input);
        System.out.println(ans);
    }

    private static String reverseStringWordWise(String input) {
        String reverse = "";
        int endIndex = input.length();
        for(int i =input.length()-1;i>0;i--){
            char c = input.charAt(i);
            if(c==' '){
                reverse+=input.substring(i+1, endIndex)+" ";
            endIndex = i;}
        }
        reverse+=input.substring(0, endIndex);
        return reverse;

    }
}
