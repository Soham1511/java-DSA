import java.util.*;

class twoSum{
    @SuppressWarnings("unused")
    public static void main(String args[]){

        int arr[] = {2,6,5,8,11};
        int target = 14;
        Arrays.sort(arr);
        
        int left = 0;
        int right = arr.length-1;
        while (left < right) {
            if(arr[left] + arr[right] < target){
                left++;
            }
            else if(arr[left] + arr[right] > target){
                right--;
            }else{
                System.out.println(left);
                System.out.println(right);
                return;
            }
        }
    }
}