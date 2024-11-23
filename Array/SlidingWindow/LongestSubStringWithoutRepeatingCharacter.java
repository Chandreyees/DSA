package Array.SlidingWindow;

import java.util.HashMap;

public class LongestSubStringWithoutRepeatingCharacter {
    public static void main(String[] args) {
        String s = "abcabcbb";
       System.out.println(longestSubStrWithUniqueChar(s));
    }

    private static int longestSubStrWithUniqueChar(String s) {
        int ans = 0;
        HashMap<Character,Integer> strMap = new HashMap<>();
        for(int i=0,j=0;j<s.length();j++){
            char c = s.charAt(j);
            strMap.put(c,strMap.getOrDefault(c,0)+1);
            while(strMap.get(c)>1){
                char leftChar = s.charAt(i);
                strMap.put(leftChar,strMap.get(leftChar)-1);
                if(strMap.get(leftChar)==0)
                    strMap.remove(leftChar);
                i++;
            }
            ans = Math.max(ans,j-i+1);
        }
        return ans;
    }

}
