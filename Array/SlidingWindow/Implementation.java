package Array.SlidingWindow;

import java.util.ArrayList;
import java.util.List;

public class Implementation {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int k = 3;
        System.out.println(findAllSubArray(arr,k));
    }

    private static List<List<Integer>> findAllSubArray(int[] arr, int k) {
        List<List<Integer>> subArrayList = new ArrayList<>();
        List<Integer> ar = new ArrayList<>();
        int n = arr.length;
        for(int i=0,j=0;j<n;j++){
            ar.add(arr[j]);
            if(ar.size()==k){
                subArrayList.add(new ArrayList<>(ar));
                ar.remove(0);
                i++;
            }
        }
        return subArrayList;
    }

}
