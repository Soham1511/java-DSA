public class splitArrayInLargeSum {
    public static long findHigh(int a[]) {
        long high = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > high) {
                high = a[i];
            }
        }
        return high;
    }

    public static long findSum(int a[]) {
        long sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }
    public static boolean canPossible(int a[], long mid, int k){
        int split = 1;
        long currSum = 0;
        boolean ans = false;
        for(int i = 0; i<a.length; i++){
            if(currSum + a[i] <= mid){
                currSum += a[i];
            }
            else{
                currSum = a[i];
                split++;
            }
        }
        if(split <= k){
            ans = true;
        }
        return ans;
    }
    public static void main(String args[]){
        int nums[] = {2000000000, 2000000000};
        int k = 1;
        long low = findHigh(nums);
        long high = findSum(nums);
        long ans = 0;
        while(low <= high){
            long mid = low + (high - low)/2;
            if(canPossible(nums, mid, k) == true){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        System.out.println(ans);
    }
}
