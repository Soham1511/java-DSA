import java.util.*;

public class minWindowSubstring {
    public static void main(String[] args) {
        Map<Character, Integer> tMap = new HashMap<>();
        Map<Character, Integer> sMap = new HashMap<>();
        String s = "a";
        String t = "aa";
        String ans = "";
        int matchedCount = 0;
        int minLength = Integer.MAX_VALUE;
        if (s.length() < t.length()) {
            System.out.println(ans);
            return;
        } else {
            for (int i = 0; i < t.length(); i++) {
                char c = t.charAt(i);
                tMap.put(c, tMap.getOrDefault(c, 0) + 1);
            } // A -> 1, B -> 1, C -> 1
            int i = 0;
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                if (tMap.containsKey(c)) {
                    sMap.put(c, sMap.getOrDefault(c, 0) + 1);

                    if (sMap.get(c) <= tMap.get(c)) {
                        matchedCount++;
                    }
                }
                while (matchedCount == t.length() ) {
                    if (j - i + 1 < minLength) {
                        minLength = j - i + 1;
                        ans = s.substring(i, j + 1);
                    }
                    char c1 = s.charAt(i);
                    if (tMap.containsKey(c1)) {
                        sMap.put(c1, sMap.get(c1) - 1);
                        if (sMap.get(c1) == 0) {
                            sMap.remove(c1);
                        }
                    }
                    i++;
                }
            }
        }
        System.out.println(ans);
    }
}
