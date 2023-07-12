package basicRecursion;

import java.util.Arrays;
import java.util.Scanner;

public class mainRecursion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int n = 0;
        while (flag) {
            System.out.println("Enter choice: ");
            System.out.println("1. Printing 1 to n");
            System.out.println("2. Printing n to 1 using backtracking");
            System.out.println("3. Printing 1 to n using backtracking");
            System.out.println("4. Print sum of n numbers using parameterized recursion");
            System.out.println("5. Print sum of n numbers using functional recursion");
            System.out.println("6. Factorial of a number");
            System.out.println("7. Reverse an array");
            System.out.println("8. Reverse the array using one pointer");
            System.out.println("9. Check if a string is a palindrome");
            System.out.println("10 Print the nth fibonacci number");

            int ch = sc.nextInt();
            if (ch != 9) {
                System.out.print("Enter the limit: ");
                n = sc.nextInt();
            }

            Recurision recursion = new Recurision();
            switch (ch) {
                case 1: {
                    int i = 1;
                    recursion.print1toN(i, n);
                    break;
                }

                case 2: {
                    recursion.printNto1UsingBacktracking(1,n);
                    break;
                }

                case 3: {
                    recursion.print1toNusingBacktracking(n, n);
                    break;
                }

                case 4: {
                    recursion.sumOfN(n, 0);
                    break;
                }
                case 5: {
                    int sum = recursion.sumOfN(n);
                    System.out.println(sum);
                    break;
                }

                case 6: {
                    int factorial = recursion.factorial(n);
                    System.out.println(factorial);
                    break;
                }

                case 7: {
                    int[] arr = new int[n];
                    System.out.print("Enter the numbers of the array with length " + n + ": ");
                    for (int i = 0; i < n; i++)
                        arr[i] = sc.nextInt();
                    recursion.reverseArray(0, n - 1, arr);
                    System.out.println(Arrays.toString(arr));
                    break;
                }
                case 8: {
                    int[] arr = new int[n];
                    System.out.print("Enter the numbers of the array with length " + n + ": ");
                    for (int i = 0; i < n; i++)
                        arr[i] = sc.nextInt();
                    recursion.reverseArrayUsingOnePointer(0,arr);
                    System.out.println(Arrays.toString(arr));
                    break;
                }
                case 9: {
                    System.out.println("Enter the String: ");
                    sc.nextLine();  // Consume newline left over from previous input
                    String str = sc.nextLine();
                    System.out.println(recursion.checkPalindrome(str, 0));
                    break;
                }
                case 10: {
                    int ans = recursion.getFibonacci(n);
                    System.out.println("The "+n+"th fibonacci number is: "+ans);
                    break;
                }
                default: {
                    System.out.println("Wrong Choice!!!!");
                }
            }

            System.out.println("Do you wish to continue? (Y/N): ");
            String s = sc.next();
            if ("N".equalsIgnoreCase(s))
                flag = false;
        }
    }
}
