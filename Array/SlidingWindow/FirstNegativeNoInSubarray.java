package Array.SlidingWindow;

import java.util.ArrayList;
import java.util.List;

public class FirstNegativeNoInSubarray {

    public static void main(String[] args) {
        int[] ar={12, 1, 3, 5};
        int k = 3   ;
        System.out.println(FirstNegativeInteger(ar,k));
    }

    static List<Integer> FirstNegativeInteger(int arr[], int k) {
        List<Integer> ans = new ArrayList<>();
        int n= arr.length;
        for(int i=0,j=0;j<n;j++){
            if(i+k-1==j){
                ans.add(findNegativeElement(arr,i,j));
                i++;
            }
        }
        return ans;
    }

    public static int findNegativeElement(int[] arr,int i,int j){
        for(int x=i;x<=j;x++){
            if(arr[x]<0)
                return arr[x];
        }
        return 0;
    }
}
