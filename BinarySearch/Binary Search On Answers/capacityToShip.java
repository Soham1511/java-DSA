class capacityToShip{
    public static int findHigh(int w[]){
        int sum = 0;
        for(int i = 0; i<w.length; i++){
            sum += w[i];
        }
        return sum;
    }
    public static int findLow(int w[]){
        int low = Integer.MIN_VALUE;
        for(int i = 0; i<w.length; i++){
            if(w[i] > low){
                low = w[i];
            }
        }
        return low;
    }
    public static void main(String[] args){
        int weights[] = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;
        int low = findLow(weights);
        int high = findHigh(weights);
        int ans = 0;
        while(low <= high){
            int mid = low + (high - low)/2;
            int maxCapacity = mid;
            int currCapacity = 0;
            int dayUsed = 1;
            int i = 0;
            while(i < weights.length){
                if(currCapacity + weights[i] > maxCapacity){
                    dayUsed++;
                    currCapacity = 0;
                }
                currCapacity += weights[i];
                i++;
            }
            if(dayUsed <= days){
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