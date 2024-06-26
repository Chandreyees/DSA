package Array.Easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MajorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n = sc.nextInt();
        int ar[] = new int[n];
        System.out.println("Enter the elements : ");
        for(int i=0;i<n;i++)
            ar[i]=sc.nextInt();
        System.out.println("Majority Element is :  "+ majorityElement(ar,n));
    }

    //brute force approach
   /* private static int majorityElement(int[] ar, int n) {
        for(int i=0;i<n-1;i++){
            int counter = 0;
            for(int j=i;j<n;j++){
                if(ar[i]==ar[j])
                    counter++;
                if(counter>n/2)
                    return ar[j];
            }
        }
        return -1;
    }*/

    //better approach using hash
   private static int majorityElement(int[] ar, int n) {
        int ans = 0;
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int i=0;i<n;i++){
            if(hashMap.containsKey(ar[i]))
                hashMap.put(ar[i],hashMap.get(ar[i])+1);
            else
                hashMap.put(ar[i],1);
        }
        for(Map.Entry<Integer,Integer> map:hashMap.entrySet()){
            if(map.getValue()>n/2)
                ans=map.getKey();
        }
        return ans;
    }

}
