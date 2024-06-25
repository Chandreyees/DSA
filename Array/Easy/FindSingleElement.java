package Array.Easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindSingleElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n = sc.nextInt();
        int ar[] = new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++)
            ar[i]=sc.nextInt();
        System.out.println(findSingleElement(ar,n));
    }

    //brute force
   /* private static int findSingleElement(int[] ar, int n) {
        if(n==1)
            return ar[0];
        int ans = 0;
        for(int i=0;i<n;i++){
            boolean flag = false;
            for(int j=i+1;j<n;j++){
                if(ar[i]==ar[j])
                    flag = true;
            }
            if(flag==false) {
                ans = ar[i];
                break;
            }
        }
        return ans;
    }*/

    //better approach (hashing)
   /* private static int findSingleElement(int[] ar, int n){
        int ans =0;
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int i=0;i<n;i++){
            if(hashMap.containsKey(ar[i]))
                hashMap.put(ar[i],hashMap.get(ar[i])+1);
            else
                hashMap.put(ar[i],1);
        }
        for(Map.Entry<Integer,Integer> entry:hashMap.entrySet()){
            if(entry.getValue()==1)
                ans = entry.getKey();
        }
        return ans;
    }*/

    //optimal approach XOR
    private static int findSingleElement(int[] ar, int n){
        int ans = 0;
        for(int i:ar)
            ans=ans^i;
        return ans;
    }
}
