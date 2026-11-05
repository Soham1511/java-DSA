import java.util.HashMap;

public class goodArray {
    public static int findMax(int a[]){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<a.length; i++){
            if(a[i] > max){
                max = a[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int nums[] = {1, 3, 3, 2};
        int max = findMax(nums);
        if(nums.length <= max || nums.length >= max + 2){
            System.out.println(false);
        }
        boolean ans = false;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        if(map.get(max) == 2 && nums.length == nums.length + 1){
            ans = true;
        }
        System.out.println(max);
        System.out.println(ans);
        System.out.println(map);
    }
}
