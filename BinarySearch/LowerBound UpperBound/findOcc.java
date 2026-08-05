public class findOcc {
    public static void main(String args[]){
        int arr[] = {8, 9, 10, 12, 12, 12};
        int left = 0;
        int right = arr.length - 1;
        int target = 12;
        int occurance = 0;
        while(arr[left] <= target && left<arr.length){
            left++;
        }
        while(arr[right] >= target&& right>0){
            right--;
        }
        occurance = left - right - 1;
        System.out.println(occurance);
    }    
}
