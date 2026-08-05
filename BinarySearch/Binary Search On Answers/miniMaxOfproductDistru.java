class miniMaxOfProductDistru{
    public static int findMax(int a[]){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<a.length; i++){
            if(a[i] > max){
                max = a[i];
            }
        }
        return max;
    }
    public static boolean canPossible(int a[], int mid, int n){
        for(int i = 0; i<a.length; i++){
            n -= (a[i] + mid - 1) / mid;
        }
        return n >= 0;
    }
    public static void main(String[] args){
        int quantities[] = {15,10,10};
        int n = 7;
        int ans = 0;
        int low = 1;
        int high = findMax(quantities);
        while(low <= high){
            int mid = low + (high - low)/2;
            if(canPossible(quantities, mid, n) == true){
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