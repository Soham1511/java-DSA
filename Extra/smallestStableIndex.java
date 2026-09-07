public class smallestStableIndex {
    public static int findMin(int a[], int startIndex){
        int min = Integer.MAX_VALUE;
        for(int i = startIndex; i<a.length; i++){
            if(a[i] < min){
                min = a[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int arr[] = {5,0,1,4};
        int k = 3;
        int maxEle = Integer.MIN_VALUE;
        int ans = -1;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > maxEle){
                maxEle = arr[i];
            }
            int minEle = findMin(arr, i);
            if(maxEle - minEle <= k){
                ans = i;
            }
        }
        System.out.println(ans);
    }
}
