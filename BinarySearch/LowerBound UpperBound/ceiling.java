class ceiling{
    public static void main(String[] args){
        int[] arr = {1, 2, 8, 10, 11, 12, 19};
        int x = 5;
        int ans = -1;
        int left = 0;
        int right = arr.length - 1;
        if(arr[right] < x){
            System.out.println(ans);
        }
        else{
            while(left <= right){
                int mid = left + (right - left)/2;
                if(arr[mid] == x){
                    ans = mid;
                }
                else if(arr[mid] > x){
                    ans = mid;
                    right = mid - 1;
                }
                else{
                    left = mid + 1;
                }
            }
        }
        System.out.println(ans);
    }
}