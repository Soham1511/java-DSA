class maxProduct{
    public static void main(String[] args) {
        int arr[] = {-2, -3, -4};
        int n = arr.length;
        int prefix[] = new int[n];
        int maxProduct = Integer.MIN_VALUE;
        prefix[0] = arr[0];
        for(int i = 1; i<n; i++){
            prefix[i] = prefix[i-1] * arr[i];
            maxProduct = Math.max(maxProduct, prefix[i]);
        }
        int suffix[] = new int[n];
        suffix[n-1] = arr[n-1];
        for(int i = n-2; i>=0; i--){
            suffix[i] = suffix[i+1] * arr[i];
            maxProduct = Math.max(maxProduct, suffix[i]);
        }
        System.out.println(maxProduct);
    }
}