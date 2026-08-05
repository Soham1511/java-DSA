class maxProduct{
    public static void main(String[] args) {
        int arr[] = {2,3,-2,4};
        int product = 1;
        int maxProduct = arr[0];
        int currentProduct = arr[0];
        for(int i = 0; i<arr.length; i++){
            product *= arr[i];
            currentProduct = Math.max(arr[i], Math.max(currentProduct * arr[i], product));
            maxProduct = Math.max(maxProduct, currentProduct);
        }
        System.out.println(maxProduct);
    }
}