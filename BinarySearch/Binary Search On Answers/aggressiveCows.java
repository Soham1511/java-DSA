import java.util.Arrays;

class aggressiveCows{
    public static boolean isPossible(int a[], int dist, int cows){
        int i = 0;
        int rem_cows = cows - 1;
        for(int j = 1; j< a.length; j++){
            if(a[j] - a[i] >= dist){
                rem_cows--;
                i = j;
                if(rem_cows == 0){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[]){
        int arr[] = {10, 1, 2, 7, 5};
        Arrays.sort(arr);
        int k = 3;
        int low = 1;
        int high = arr[arr.length - 1] - arr[0];
        int ans = 0;
        while(low <= high){
            int mid = low + (high - low)/2;
            boolean isPlacebleAll = isPossible(arr, mid, k);
            if(isPlacebleAll){
                ans = mid;
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        System.out.println(ans);
    }
}