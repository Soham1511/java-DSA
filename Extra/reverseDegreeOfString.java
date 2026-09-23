import java.util.HashMap;

class reverseDegreeOfString{
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
        String s = "abc";
        char c = 'a';
        int sum = 0;
        int i = 26;
        int currIdx = 1;
        while(i > 0 && c <= 'z'){
            map.put(c, i);
            c++;
            i--;
        }
        for(int j = 0; j<s.length(); j++){
            sum += map.get(s.charAt(j)) * currIdx;
            currIdx++;
        }
        System.out.println(map);
        System.out.println(sum);
    }
}