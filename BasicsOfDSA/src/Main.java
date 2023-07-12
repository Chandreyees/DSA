import basicMaths.OperationOnDigits;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        OperationOnDigits ob = new OperationOnDigits(n);
        System.out.print("Enter your choice: 1 for count, 2 for reverse, 3 for checkPalindrome, 4 for HCF, 5 for Armstrong" +
                " 6 for prime, 7 for printing the divisors, 8 for checkPrime : ");
        int choice = sc.nextInt();
        switch (choice){
            case 1 :{
                int count = ob.countDigits(n);
                System.out.println(count);
                break;
            }

            case 2 : {
                int reverse = ob.reverse(n);
                System.out.println(reverse);
                break;
            }
            case 3 :{
                System.out.println(ob.isPalindrome(n));
                break;
            }

            case 4 : {
                System.out.println("Enter the other no for HCF: ");
                int m = sc.nextInt();
                int hcf = ob.getHCF(n,m);
                System.out.println("HCF of "+n+" and "+m+" is : "+hcf);
                break;
            }

            case 5 : {
                System.out.println(ob.isArmstrong(n));
                break;
            }

            case 7 :{
                System.out.println("The divisors of "+n+" are :");
                List<Integer> result = ob.getDivisors(n);
                System.out.println(result.toString());
                break;
            }

            case 8:{
                System.out.println(ob.isPrime(n));
                break;
            }

            default:
                System.out.println("Wrong Choice!!!!!");
        }
    }
}