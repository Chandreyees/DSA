package StackAndQueue.medium;

import java.util.Stack;

public class InfixToPostfix {

    public static String infixToPostfix(String exp) throws Exception {
        Stack<Character> s = new Stack<>();
        String res = new String();
        for(int i = 0;i<exp.length();i++) {
            char ch = exp.charAt(i);
            if (Character.isLetterOrDigit(ch))
                res += ch;
            else if (ch == '(') {
                s.push(ch);
            } else if (ch == ')') {
                while (!s.isEmpty() && s.peek() != '(') {
                    res += s.pop();
                }
                s.pop();
            } else {
                while (!s.isEmpty() && getPref(ch) <= getPref(s.peek()))
                    res += s.pop();
                s.push(ch);
            }
        }
            while (!s.isEmpty()){
                if(s.peek()=='(')
                    throw new Exception("Invalid Exp");
                res+=s.pop();
            }
            return res;
    }

    private static int getPref(char c){
        switch(c){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;

            case '^':
                return 3;
        }
        return -1;
    }
}
