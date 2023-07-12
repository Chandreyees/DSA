package basicRecursion;

import static java.util.Collections.swap;

public class Recurision {

    public void print1toN(int i,int n){
        if(i>n)
            return;
        System.out.print(i+" ");
        print1toN(i+1,n);
    }

    public void print1toNusingBacktracking(int i,int n){
        if(i<1)
            return;
        print1toNusingBacktracking(i-1,n);
        System.out.print(i+" ");
    }

    public void printNto1UsingBacktracking(int i,int n){
        if(i>n)
            return;
        printNto1UsingBacktracking(i+1,n);
        System.out.print(i+" ");
    }

    //sum of n nos using Functional Rescursion
    public int sumOfN(int n){
        if(n==0)
            return 0;
        return n + sumOfN(n-1);
    }

    //sum of n nos using parameterised recursion
    public void sumOfN(int i,int sum){
        if(i==0)
        {
            System.out.println(sum);
            return;
        }
        sumOfN(i-1,sum+i);
    }

    public int factorial(int n){
        if(n==1)
            return 1;
        return n*factorial(n-1);
    }

    //using two pointer
    public void reverseArray(int i,int n, int[] arr){
        if(i>=n)
            return;
        int temp=arr[i];
        arr[i]=arr[n];
        arr[n]=temp;
       reverseArray(i+1,n-1,arr);
    }

    public void reverseArrayUsingOnePointer(int i,int[] arr){
        if(i>=(arr.length)/2)
            return;
        swapArray(arr,i,arr.length-i-1);
        reverseArrayUsingOnePointer(i+1,arr);
    }

    private void swapArray(int[] arr,int i, int n) {
        int temp = arr[i];
        arr[i]=arr[n];
        arr[n]=temp;
    }

    public boolean checkPalindrome(String s,int i){
        if (i >= (s.length()) / 2)
            return true;
        return (s.charAt(i) == s.charAt(s.length() - i - 1)) && checkPalindrome(s, i + 1);
    }

    public int getFibonacci(int n) {
        if(n==1 || n==0)
            return n;
        return getFibonacci(n-1)+getFibonacci(n-2);
    }
}
