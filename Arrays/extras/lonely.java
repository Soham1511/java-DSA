import java.util.*;
class lonely{
    public static void main(String[] args){
        List<Integer> ans = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        int[] arr = {1,3,5,3};
        for(int i = 0; i<arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        for(int i = 0; i<arr.length; i++){
            int prev = arr[i] - 1;
            int next = arr[i] + 1;
            if(!map.containsKey(prev) && !map.containsKey(next)){
                if(map.get(arr[i]) == 1){
                    ans.add(arr[i]);
                }
            }
        }
        System.out.println(ans);
    }
}