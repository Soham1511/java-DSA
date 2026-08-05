public class minSizeSubArrSum {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,1,1,1};
        int target = 11;
        int n = arr.length;
        int left = 0; 
        int sum = 0;
        int length = Integer.MAX_VALUE;
        for(int right = 0; right < n; right++){
            sum += arr[right];
            while(sum >= target){
                length = Math.min(length, right - left + 1);
                sum -= arr[left];
                left++;
            }
            if(length == Integer.MAX_VALUE && right == n-1){
                length = 0;
            }
        }
        System.out.println(length);
    }    
}
