import java.util.*;
public class TwoSum2 {

    public static void main(String[] args) {
        int arr[] = {2,7,11,15};
        int idx1 = 0;
        int idx2 = 0;
        int left = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        int target = 9;
        while(left < arr.length){
            int find = target - arr[left];
            for(int right = 0; right<arr.length; right++){
                if(arr[right] == find){
                    idx2 = right+1;
                    idx1 = left+1;
                }
            }
            left++;
        }
        ans.add(idx2);
        ans.add(idx1);
        System.out.println(ans);
    }
}