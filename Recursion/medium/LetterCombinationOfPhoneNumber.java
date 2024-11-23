package Recursion.medium;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationOfPhoneNumber {

    public static void main(String[] args) {
        String digit = "2";
        System.out.println(letterCombinations(digit));
    }

    private static List<String> letterCombinations(String digit) {
        if(digit.length()==0)
            return List.of();
        String op = "";
        int index = 0;
        String[] mapping = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        return helper(digit,mapping,index,op);
    }

    private static List<String> helper(String digit, String[] mapping, int index, String op) {
        List<String> ans = new ArrayList<>();
        if(index==digit.length()) {
            ans.add(op);
            return ans;
        }
        int number = Integer.parseInt(digit.substring(index,index+1));
        String val = mapping[number];
        for(int i=0;i<val.length();i++)
            ans.addAll(helper(digit,mapping,index+1,op+val.charAt(i)));
        return ans;
    }
}
