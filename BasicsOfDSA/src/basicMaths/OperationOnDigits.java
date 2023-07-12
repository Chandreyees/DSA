package basicMaths;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OperationOnDigits {

    int n;

    public OperationOnDigits(int n){
        this.n=n;
    }

    public int countDigits(int n){
        return (int)(Math.log10(n)+1);
    }

    public int reverse(int n) {
        int reverse = 0;
        while(n>0){
            reverse = reverse*10 + (n%10);
            n=n/10;
        }
        return reverse;
    }

    public boolean isPalindrome(int n) {
        int reverse = reverse(n);
        if(n==reverse)
            return true;
        else return false;
    }

    public int getHCF(int n, int m) {
        //using naive solution
        int min = (n>m) ? n : m;
        /*
        for(int i=min;i>=1;i--) {
            if (n % i == 0 && m % i == 0)
                return i;
        }*/


        //using Euclidean Algorithm
        while(n>0 && m>0){
            if(n>m)
                n = n%m;
            else m =m%n;
            if(n == 0) return m;
            return n;
        }
        return 0;
    }

    public boolean isArmstrong(int n) {
        int check = 0;
        int k=n;
        while(n>0){
            check += (int)Math.pow(n%10,3);
            n=n/10;
        }
        return check==k;
    }

    public List<Integer> getDivisors(int n){
        ArrayList<Integer> ans = new ArrayList<>();
        //optimised way
        for(int i=1;i<=(int)Math.sqrt(Double.valueOf(n));i++){
            if(n%i==0){
                ans.add(i);
                if((n/i)!=i)
                    ans.add(n/i);
            }
        }
        Collections.sort(ans);
        return ans;
    }

    public boolean isPrime(int n) {
        List<Integer> arr = getDivisors(n);
        if(arr.size()>2)
            return false;
        else
            return true;
        }
}
