import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class kMostFrequent {
    public static void main(String[] args) {
        int nums[] = {1,1,1,2,2,3};
        int k = 2;
        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for(int i = 0; i<nums.length; i++){
            if(map.get(nums[i]) >= k){
                list.add(nums[i]);
            }
        }
        int[] ans = list.stream().mapToInt(i -> i).toArray();
        System.out.println(ans);
    }
}
