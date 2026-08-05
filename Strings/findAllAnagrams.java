import java.util.*;
public class findAllAnagrams {
    public static void main(String[] args){
        String s = "cbaebabacd";
        String p = "abc";
        List<Integer> result = new ArrayList<>();
        Map<Character, Integer> pMap = new HashMap<>();
        for(int i = 0; i<p.length(); i++){
            pMap.put(p.charAt(i), pMap.getOrDefault(p.charAt(i), 0) + 1);
        }
        Map<Character, Integer> sMap = new HashMap<>();
        for(int i = 0; i<s.length(); i++){
            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0) + 1);
            if(i >= p.length()){
                char leftChar = s.charAt(i - p.length());
                sMap.put(leftChar, sMap.get(leftChar) - 1);
                if(sMap.get(leftChar) == 0){
                    sMap.remove(leftChar);
                }
            }
            if(sMap.equals(pMap)){
                result.add(i - p.length() + 1);
            }
        }
        System.out.println(result);
    }
}
