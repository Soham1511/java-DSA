import java.util.*;
class returnSubstring {
    public static void main(String[] args) {
        HashMap<Character, Integer> m1 = new HashMap<>(); // t map
        HashMap<Character, Integer> m2 = new HashMap<>(); // s map
        String s = "ADOBECODEBANC";
        String t = "ABC";
        for(int i = 0; i<t.length(); i++){
            char c = t.charAt(i);
            m1.put(c, m1.getOrDefault(c, 0) + 1);
        }
        int i = 0;
        for(int j = 0; j<s.length(); j++){
            char c = s.charAt(j);
            if(m1.containsKey(c) ){
                m2.put(c, j);
            }
            if(m2.size() == m1.size()){
                while(i <= j){
                    char c1 = s.charAt(i);
                    if(m1.containsKey(c1) && m2.get(c1) == i){
                        break;
                    }
                    i++;
                }
            }
        }
        System.out.println(m2);
    }
}