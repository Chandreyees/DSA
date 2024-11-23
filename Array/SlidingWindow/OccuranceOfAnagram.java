package Array.SlidingWindow;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class OccuranceOfAnagram {

    public static void main(String[] args) {
        String txt = "kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk";
        String pat = "kkkkk";
        System.out.println(search(pat, txt));
    }

    public static int search(String pat, String txt) {
        int l = pat.length();
        int count = 0;
        LinkedHashMap<Character, Integer> patternMap = new LinkedHashMap<>();
        for (char c : pat.toCharArray()) {
            patternMap.put(c, patternMap.getOrDefault(c, 0) + 1);
        }
        HashMap<Character, Integer> window = new HashMap<>();
        for (int i = 0, j = 0; j < txt.length(); j++) {
            char currentChar = txt.charAt(j);
            window.put(currentChar, window.getOrDefault(currentChar, 0) + 1);
            if (j - i >= l) {
                char charToRemove = txt.charAt(i);
                if (window.containsKey(charToRemove)) {
                    window.put(charToRemove, window.get(charToRemove) - 1);
                    if (window.get(charToRemove) == 0)
                        window.remove(charToRemove);
                }
                i++;
            }
            if (window.equals(patternMap))
                count++;
        }
        return count;
    }
}
