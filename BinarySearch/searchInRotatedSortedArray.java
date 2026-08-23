class searchInRotatedSortedArray{
    public static void main(String[] args) {
        int arr[] = {3, 5, 5, 6, 0, 0, 1, 1, 3};
        int target = 3;
        int low = 0;
        int high = arr.length - 1;
        boolean ans = false;
        while (low <= high) {
            int mid = low + (high - low)/2;
            if(arr[mid] == target){
                ans = true;
            }
            if(arr[low] == arr[mid] && arr[mid] == arr[high]){
                low++;
                high--;
            }
            else if(arr[low] <= arr[mid]){
                if(arr[low] <= target && target < arr[mid]){
                    high = mid - 1;
                }
                else{
                    low = mid + 1;
                }
            }
            else{
                if(target > arr[mid] && target <= arr[high]){
                    low = mid + 1;
                }
                else{
                    high = mid - 1;
                }
            }

        }
        System.out.println(ans);
    }
}