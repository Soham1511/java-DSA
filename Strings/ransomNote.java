import java.util.*;
class ransomNote{
    public static void main(String[] args){
        String ransomNote = "aa";
        String magazine = "aab";
        Map<Character, Integer> m1 = new HashMap<>();
        Map<Character, Integer> m2 = new HashMap<>();
        for(int i = 0; i < ransomNote.length(); i++){
            char c = ransomNote.charAt(i);
            m1.put(c, m1.getOrDefault(c, 0) + 1);
        }
        for(int i = 0; i < magazine.length(); i++){
            char c = magazine.charAt(i);
            m2.put(c, m2.getOrDefault(c, 0) + 1);
        }
        boolean canConstruct = true;
        for(Map.Entry<Character, Integer> entry : m1.entrySet()){
            char c = entry.getKey();
            int count = entry.getValue();
            if(m2.getOrDefault(c, 0) < count){
                canConstruct = false;
                break;
            }
        }
        System.out.println(canConstruct);
    }
}