package arrayEasy.Sorting;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveDuplicates {

    public void removeDuplicates(int[] arr,int n){
        //BruteForce
        /*Set<Integer> set = new HashSet<>();
        int j=0;
        for(int i=0;i<n;i++)
            set.add(arr[i]);
        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext()){
            arr[j]=iterator.next();
            j++;
        }
            Arrays.fill(arr,j,n,0);*/
        //optimal approach
        int i=0,j=1;
        while(i<n && j<n){
            if(arr[i]!=arr[j]){
                arr[i+1]=arr[j];
                i++;j++;
            }
            else
                j++;
        }
        Arrays.fill(arr,i+1,n,0);
    }
}
