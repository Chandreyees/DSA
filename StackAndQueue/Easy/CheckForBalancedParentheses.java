package StackAndQueue.Easy;

import java.util.Stack;

public class CheckForBalancedParentheses {

    public static void main (String[] args) {

        String s="()[{}()]";
        if(isValid(s)==true)
            System.out.println("True");
        else
            System.out.println("False");
    }

    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray()){
            if(c=='(' || c=='{' || c=='[')
                st.push(c);
            else {
                if(st.isEmpty())
                    return false;
                char ch = st.pop();
                if((c == ')' && ch == '(') ||  (c == ']' && ch == '[') || (c == '}' && ch == '{'))
                    continue;
                else return false;
            }
        }
        return st.isEmpty();
    }
}
