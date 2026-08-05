import java.util.*;
class subStringWithConcatenation{
    public static void main(String[] args){
        String[] words = {"foo","bar"};
        String s = "barfoothefoobarman";
        List<Integer> ans = new ArrayList<>();
        if(words.length == 0 || s.length() == 0){
            System.out.println(ans);
            return;
        }
        Map<String, Integer> wMap = new HashMap<>();
        int wordLen = words[0].length();
        int totalLen = wordLen * words.length;
        for(String word : words){
            wMap.put(word, wMap.getOrDefault(word, 0) + 1);
        } // foo -> 1, bar -> 1
        for(int i = 0; i <= s.length() - totalLen; i++){
            String sub = s.substring(i, i + totalLen);
            Map<String, Integer> subMap = new HashMap<>();
            for(int j = 0; j < totalLen; j += wordLen){
                String w = sub.substring(j, j + wordLen);
                subMap.put(w, subMap.getOrDefault(w, 0) + 1);
            }
            if(subMap.equals(wMap)){
                ans.add(i);
            }
        }
        System.out.println(ans);
    }
}