    class maximumCandiesAllocate{
        public static int findHigh(int a[]){
            int high = Integer.MIN_VALUE;
            for(int i = 0; i<a.length; i++){
                if(a[i] > high){
                    high = a[i];
                }
            }
            return high;
        }
        public static long findSum(int a[]){
    long sum = 0;
    for(int i = 0; i < a.length; i++){
        sum += a[i];
    }
    return sum;
}
        public static boolean canPossible(int a[], int mid, int k){
            for(int i = 0; i<a.length; i++){
                k -= a[i] / mid;
                if(k <= 0){
                    return true;
                }
            }
            return false;
        }
        public static void main(String args[]){
            int candies[] = {4,7,5};
            int k = 16;
            int low = 1;
            int high = findHigh(candies);
            int ans = 0;
            if(findSum(candies) < k){
                System.out.println(ans);
            }
            else{
                while(low <= high){
                    int mid = low + (high - low)/2;
                    if(canPossible(candies, mid, k) == true){
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
    }