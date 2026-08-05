public class searchElement {
    public static void main(String[] args){
        int[] nums = {6,7,8,1,2,3,4,5};
        int target = 8;
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] == target){
                System.out.println(mid);
                return;
            }
            else if(nums[left] <= nums[mid] && target >= nums[left] && target < nums[mid]){
                right = mid - 1; // left is sorted
            }
            else if(nums[mid] <= nums[right] && target > nums[mid] && target <= nums[right]){
                left = mid + 1; // right is sorted
            }
            else if(nums[left] <= nums[mid]){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        System.out.println(-1);
    }
}
