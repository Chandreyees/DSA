package basicHashing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class DuplicatesInArray {

    int n;
    public DuplicatesInArray(int n){
        this.n=n;
    }

    public void findDuplicateNumbers(int[] arr, int n) {
        int[] hash = new int[100001];
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<n;i++)
            hash[arr[i]]++;
        for(int i=0;i<hash.length;i++){
            if(hash[i]>1)
                ans.add(i);
        }
        Collections.sort(ans);
        if(ans.size()==0) {
            System.out.println("There are no duplicates in the array ");
            return;
        }
        System.out.println("The duplicate elements : "+ans.toString());
    }

    public void findDuplicateCharacters(char[] c, int n) {
        int hash[] = new int[27];
        ArrayList<Character> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int index = (int) c[i] - (int) 'a';
            hash[index]++;
        }
        for (int i = 0; i < hash.length; i++) {
            if (hash[i] > 1)
                ans.add((char)(i+'a'));
        }
        if(ans.size()==0){
            System.out.println("There are no duplicates in the array: ");
            return;
        }
        System.out.println("The duplicate elements: "+ans.toString());
    }

    public HashMap<Integer,Integer> findDuplicatesUsingMap(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int key : arr){
            if(map.containsKey(key))
            map.put(key,map.get(key)+1);
            else
                map.put(key,1);
        }
        return map;
    }
}
