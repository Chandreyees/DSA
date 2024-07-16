package LinkedList.medium;

import LinkedList.ListNode;

import java.util.Scanner;

public class HappyNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println(checkHappyNumber(n));
    }

    private static boolean checkHappyNumber(int n) {
        int slow = n;
        int fast = n;
        do {
            slow = getSumOfDigit(slow);
            fast = getSumOfDigit(getSumOfDigit(fast));
        }while(slow!=fast);
        if(slow==1)
            return true;
        return false;
    }

    private static int getSumOfDigit(int n){
        int sum = 0;
        while(n!=0){
            int rem = n%10;
            sum+=rem*rem;
            n=n/10;
        }
        return sum;
    }
}
