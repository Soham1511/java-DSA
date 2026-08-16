import java.util.*;
public class circularNextGreaterEle {
    public static void main(String args[]){
        int nums[] = {2, 1, 2};
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = nums.length * 2 - 1; i >= 0; i--){
            while (!stack.isEmpty() && stack.peek() <= nums[i % nums.length]) {
                stack.pop();
            }
            if(stack.isEmpty()){
                map.put(i % nums.length, -1);
            }
            else{
                map.put(i % nums.length, stack.peek());
            }
            stack.push(nums[i % nums.length]);
        }
        int ans[] = new int[nums.length];
        for(int i = 0; i<nums.length; i++){
            ans[i] = map.get(i);
        }
        System.out.println(Arrays.toString(ans));
    }
}
