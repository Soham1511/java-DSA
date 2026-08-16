import java.util.*;
public class longestSubstringWithK {
    public static void main(String[] args) {
        String s = "aaabb";
        int k = 3;
        int i = 0;
        int maxLen = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int j = 0; j < s.length(); j++){
            map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);
            if(map.get(s.charAt(j)) > k){
                while(map.get(s.charAt(j)) > k){
                    map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
                    i++;
                }
            }
            maxLen = Math.max(maxLen, j - i + 1);
        }
        System.out.println(maxLen);
    }
}
