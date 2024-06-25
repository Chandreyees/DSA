package Array.Easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array: ");
        int n = sc.nextInt();
        int ar[] = new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++)
            ar[i]=sc.nextInt();
        System.out.println("Enter the target: ");
        int target = sc.nextInt();
        int result[]=findTwoSumDigits(ar,n,target);
        System.out.println(Arrays.toString(result));
    }


    //brute force
    /*private static int[] findTwoSumDigits(int[] ar, int n, int target) {
        int res[] = new int[2];
        for(int i=0;i<n-1;i++){
            int search = target-ar[i];
            for (int j=i+1;j<n;j++){
                if(search==ar[j]){
                    res[0]=i;
                    res[1]=j;
                    break;
                }
            }
            if(res[1]!=0)
                break;
        }
        return res;
    }*/

    //better approach using hash
    private static int[] findTwoSumDigits(int[] ar, int n, int target){
        int res[] = new int[2];
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int i=0;i<n;i++){
            if(hashMap.containsKey(target-ar[i])){
                 res[0]=i;
                 res[1]=hashMap.get(target-ar[i]);
                 return res;
            }
            hashMap.put(ar[i],i);
        }
        Arrays.sort(res);
        return res;
    }

}
