package Recursion.medium;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {
        String s = "ab";
        System.out.println(findPermutationOfString(s,""));

    }

    private static List<String> findPermutationOfString(String s, String op) {
        List<String> ans = new ArrayList<>();
        if(s.isEmpty()) {
            ans.add(op);
            return ans;
        }
        char ch = s.charAt(0);
        for(int i=0;i<=op.length();i++){
            String first = op.substring(0,i);
            String second = op.substring(i,op.length());
//            op+=s.substring(0,i)+ch+s.substring(i,op.length());
            ans.addAll(findPermutationOfString(s.substring(1),first+ch+second));
        }
        return ans;
    }
}
