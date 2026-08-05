import java.util.*;
public class mapIsContains {
    public static void main(String[] args){
        Map<Character, Integer> map = new HashMap<>();
        int count = 0;
        String s = "pwwkew";
        int i = 0;
        for(int j = 0; j < s.length(); j++){
            char c = s.charAt(j);
            map.put(c, map.getOrDefault(c, 0) + 1);
            
            while(map.get(c) > 1){
                char leftChar = s.charAt(i);
                map.put(leftChar, map.get(leftChar) - 1);
                i++;
            }
            count = Math.max(count, j - i + 1);
        }
        System.out.println(count);


    }
}
