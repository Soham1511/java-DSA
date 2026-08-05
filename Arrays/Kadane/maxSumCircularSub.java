public class maxSumCircularSub {
    public static void main(String[] args) {
        int arr[] = {1,-2,3,-2};
        int currentMax = arr[0];
        int maxSub = arr[0];
        int currentMin = arr[0];
        int minSub = arr[0];
        int totalSum = arr[0];
        for(int i = 1; i<arr.length; i++){
            totalSum += arr[i];
            currentMax = Math.max(arr[i], currentMax + arr[i]);
            maxSub = Math.max(maxSub, currentMax);
            currentMin = Math.min(arr[i], currentMin + arr[i]);
            minSub = Math.min(minSub, currentMin);
        }
        if(arr.length == 1){
            System.out.println(arr[0]);
            return;
        }else if(totalSum == minSub){
            System.out.println(maxSub);
        }
        
        else{
            int totalMaxCircular = totalSum - minSub;
            System.out.println(Math.max(maxSub, totalMaxCircular));
        }
    }    
}
