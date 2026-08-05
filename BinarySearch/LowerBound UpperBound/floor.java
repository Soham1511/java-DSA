class floor{
    public static void main(String[] args){
        int arr[] = {1, 2, 8, 10, 10, 12, 19};
        int x = 0;
        int left = 0;
        int ans = -1;
        int right = arr.length - 1;
        if(arr[left] > x){
            System.out.println(ans);
        }
        else{
            while(left <= right){
                int mid = left + (right - left)/2;
                if(arr[mid] <= x){
                    ans = mid;
                    left = mid + 1;
                }
                else{
                    right = mid - 1;
                }
            }
            System.out.println(ans);
        }
    }
}