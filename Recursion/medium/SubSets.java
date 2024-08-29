package Recursion.medium;

import java.util.ArrayList;
import java.util.List;

public class SubSets {

    public static void main(String[] args) {
        String s = "ab";
        //System.out.println(findSubsequenceOfString("",s));
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(1);
        ar.add(2);
        ar.add(3);
        System.out.println(findSubset(ar));
    }

    private static ArrayList<ArrayList<Integer>> findSubset(ArrayList<Integer> ar) {
        ArrayList<Integer> op = new ArrayList<>();
        int index = 0;
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        findSubsetHelper(op,ar,index,ans);
        return ans;
    }

    private static void findSubsetHelper(ArrayList<Integer> op, ArrayList<Integer> ar, int index ,
                                                            ArrayList<ArrayList<Integer>> ans) {
       if(index>=ar.size())
       {
           ans.add(new ArrayList<>(op));
           return;
       }
        //exclude
        findSubsetHelper(op,ar,index+1,ans);
        //include
        op.add(ar.get(index));
        findSubsetHelper(op,ar,index+1,ans);
        op.remove(op.size()-1);
    }

    public static ArrayList<String> findSubsequenceOfString(String op,String ip){
        ArrayList<String> list = new ArrayList<>();
         if(ip.isEmpty()){
             return list;
         }
         list.add(op+ip.substring(0,1));
         ArrayList<String> prevCall = findSubsequenceOfString(op+ip.substring(0,1),ip.substring(1));
         list.addAll(prevCall);
         prevCall = findSubsequenceOfString(op,ip.substring(1));
         list.addAll(prevCall);
         return list;
     }
}
