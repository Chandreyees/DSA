package Array.SlidingWindow;

import java.util.HashMap;

public class LongestSubstringWithKUnique {
    public static void main(String[] args) {
        String s = "aabaaab";
        int k=2;
        System.out.println(longestSubStr(s,k));
    }

    private static int longestSubStr(String s, int k) {
        int ans =-1;String sp="";
        HashMap<Character,Integer> uniqueLetterMap = new HashMap<>();
        for(int i=0,j=0;j<s.length();j++){
            char c = s.charAt(j);
            uniqueLetterMap.put(c,uniqueLetterMap.getOrDefault(c,0)+1);
            if(uniqueLetterMap.size()==k){
                ans = Math.max(ans,j-i+1);
            }
            while(uniqueLetterMap.size()>k) {
                char prevChar = s.charAt(i++);
                if(uniqueLetterMap.containsKey(prevChar)) {
                    uniqueLetterMap.put(prevChar, uniqueLetterMap.get(prevChar) - 1);
                    if (uniqueLetterMap.get(prevChar)==0)
                        uniqueLetterMap.remove(prevChar);
                }
            }
        }
        return ans;
    }
}
