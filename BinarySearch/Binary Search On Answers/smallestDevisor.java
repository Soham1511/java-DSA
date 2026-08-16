public class smallestDevisor {
    public static int findHigh(int a[]){
        int high = Integer.MIN_VALUE;
        for(int i = 0; i < a.length; i++){
            if(a[i] > high){
                high = a[i];
            }
        }
        return high;
    }
    public static boolean canPossible(int a[], double mid, int threshold){
        int sum = 0;
        for(int i = 0; i < a.length; i++){
            double c = a[i];
            sum += Math.ceil(c / mid);
        }
        return sum <= threshold;
    }
    public static void main(String[] args) {
        int arr[] = {21212,10101,12121};
        int threshold = 1000000;
        int low = 1;
        int high = findHigh(arr);
        int ans = 0;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(canPossible(arr, mid, threshold) == true){
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
