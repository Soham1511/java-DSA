//Input: nums = [0,0,1,1,1,1,2,3,3]
// Output: 7, nums = [0,0,1,1,2,3,3,_,_]
// Explanation: Your function should return k = 7, with the first seven elements of nums being 0, 0, 1, 1, 2, 3 and 3 respectively.
// It does not matter what you leave beyond the returned k (hence they are underscores).

import java.util.Arrays;

class removeDuplicates{
    public static void main(String[] args){
        int nums[] = {1,1,1,2,2,3};
        int n = nums.length;
        if(n <= 2){
            System.out.println(Arrays.toString(nums));
            return;
        }
        int i = 2;
        for(int j = 2; j<n; j++){
            if(nums[j] != nums[i-2]){
                nums[i] = nums[j];
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}