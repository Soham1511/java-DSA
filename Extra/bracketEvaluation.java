import java.util.*;
class bracketEvaluation{
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        List<List<String>> knowledge = new ArrayList<>();
        knowledge.add(Arrays.asList("a","yes"));
        String s = "(a)(a)(a)aaa";
        for(List<String> subList : knowledge){
            String key = subList.get(0);
            String value = subList.get(1);
            map.put(key, value);
        }
        int i = 0;
        StringBuilder sb = new StringBuilder();
        StringBuilder ans = new StringBuilder();
        while(i<s.length()){
            if(s.charAt(i) == '('){
                int j = i+1;
                while(s.charAt(j) != ')'){
                    sb.append(s.charAt(j));
                    j++;
                }
                if(map.containsKey(sb.toString())){
                    ans.append(map.get(sb.toString()));
                }
                else{
                    ans.append('?');
                }
                sb.setLength(0);
                i = j + 1;
            }
            else{
                ans.append(s.charAt(i));
                i++;
            }
        }
        System.out.println(ans.toString());
    }
}