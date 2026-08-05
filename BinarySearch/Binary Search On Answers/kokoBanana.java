class kokoBanana{
    public static int findHigh(int p[]){
        int high = Integer.MIN_VALUE;
        for(int i = 0; i<p.length; i++){
            if(p[i] > high){
                high = p[i];
            }
        }
        return high;
    }
    public static void main(String args[]){
        int piles[] = {805306368,805306368,805306368};
        int h = 1000000000;
        int low = 1;
        int high = findHigh(piles);
        int ans = 0;
        while(low <= high){
            int mid = low + (high - low)/2;
            int k = mid;
            long hrsCount = 0;
            for(int i = 0; i<piles.length; i++){
                hrsCount += (piles[i] + k - 1) / k;
            }
            if(hrsCount <= h){
                ans = k;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        System.out.println(ans);
    }
}