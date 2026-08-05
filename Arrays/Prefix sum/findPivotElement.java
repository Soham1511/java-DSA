class findPivotElement{
    public static void main(String[] args) {
        int arr[] = {2,1,-1};
        int pivot = -1;
        int left = 0;
        int n = arr.length;
        int right = n-1;
        int leftSum = 0;
        int rightSum = 0;
        while(left < right){
            if(leftSum <= rightSum){
                leftSum += arr[left];
                left++;
            }
            else{
                rightSum += arr[right];
                right--;
            }
            if(leftSum == rightSum && left == right){
                pivot = left;
            }
        }
        System.out.println(pivot);
    }
}