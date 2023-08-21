package arrayEasy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Question: You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the ith customer has in the jth bank.
Return the wealth that the richest customer has.
 A customer's wealth is the amount of money they have in all their bank accounts.
 The richest customer is the customer that has the maximum wealth.
*/
public class RichestCustomerWealth {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the rows and columns of the array: ");
        int row = Integer.parseInt(br.readLine());
        int col = Integer.parseInt(br.readLine());
        int[][] ar = new int[row][col];
        System.out.print("Enter the elements of the array: ");
        for (int i=0;i<row;i++){
            for (int j = 0; j < col; j++) {
                ar[i][j] = Integer.parseInt(br.readLine());
            }
        }
        int result = maximumWealth(ar);
        System.out.println(" "+result);
    }

    private static int maximumWealth(int[][] accounts) {
        int wealth = 0,sum=0;
        for(int i=0;i<accounts.length;i++){
            for(int j=0;j<accounts[i].length;j++){
                sum+=accounts[i][j];
            }
            if(wealth<sum)
                wealth=sum;
            sum=0;
        }
        return wealth;
    }


}
