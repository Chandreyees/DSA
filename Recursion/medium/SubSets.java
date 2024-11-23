package Recursion.medium;

import java.util.ArrayList;
import java.util.List;

public class SubSets {

    public static void main(String[] args) {
        String s = "aabc";
        System.out.println(findSubsequenceOfString(s,""));
        System.out.println(printAsciiOfSubseq(s,0));
       /* ArrayList<Integer> ar = new ArrayList<>();
        ar.add(1);
        ar.add(2);
        ar.add(3);
        //ar -> [1,2,3]
        System.out.println(findSubset(ar));*/
    }

    private static List<Integer> printAsciiOfSubseq(String s, int op) {
        List<Integer> list = new ArrayList<>();
        if(s.isEmpty()) {
            list.add(op);
            return list;
        }
        int ascii = s.charAt(0)+0;
        list.addAll(printAsciiOfSubseq(s.substring(1),op+ascii));
        list.addAll(printAsciiOfSubseq(s.substring(1),op));
        return list;
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

    public static ArrayList<String> findSubsequenceOfString(String s,String op){
        ArrayList<String> list = new ArrayList<>();
        if(s.isEmpty())
            return list;
        list.add(op+s.substring(0,1));
        //left computation -> take the first element in op
        list.addAll(findSubsequenceOfString(s.substring(1),op+s.substring(0,1)));
        //right computation -> don't take the first element in op
        list.addAll( findSubsequenceOfString(s.substring(1),op));
        return list;
     }
}
