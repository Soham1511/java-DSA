public class maxAbsoluteSum {
    public static void main(String[] args) {
        int arr[] = {-7,-1,0,-2,1,3,8,-2,-6,-1,-10,-6,-6,8,-4,-9,-4,1,4,-9};
        int currentMax = arr[0];
        int maxSub = arr[0];
        int currentMin = arr[0];
        int minSub = arr[0];
        for(int i = 1; i<arr.length; i++){
            currentMax = Math.max(arr[i], currentMax + arr[i]);
            maxSub = Math.max(maxSub, currentMax);
            currentMin = Math.min(arr[i], currentMin + arr[i]);
            minSub = Math.min(minSub, currentMin);
        }
        System.out.println(Math.max(Math.abs(maxSub), Math.abs(minSub)));
    }
}
