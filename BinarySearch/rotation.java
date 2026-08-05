//Input: arr[] = [5, 1, 2, 3, 4]
// Output: 1
// Explanation: The given array is [5, 1, 2, 3, 4]. The original sorted array is [1, 2, 3, 4, 5]. We can see that the array was rotated 1 times to the right.
class rotation{
    public static void main(String args[]){
        int arr[] = {5, 1, 2, 3, 4};
        int left = 0;
        int right = arr.length - 1;
        while(left < right){
            int mid = left + (right - left)/2;
            if(arr[mid] < arr[right]){
                right = mid;
            }
            else if(arr[mid] > arr[right]){
                left = mid + 1;
            }
        }
        System.out.println(left);
    }
}