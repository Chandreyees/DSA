package Basics.maths;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountDigits {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number: ");
        int n = Integer.parseInt(reader.readLine());
        System.out.println("Result is: "+countDigit(n));
    }

    public static int countDigit(int n) {
        return (int)(Math.log10(n)+1);
    }
}
