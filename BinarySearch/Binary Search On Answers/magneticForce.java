import java.util.Arrays;

class magneticForce{
    public static boolean canPossible(int p[], int m, int dist){
        int rem_ball = m - 1;
        boolean ans = false;
        int i = 0;
        for(int j = 1; j<p.length; j++){
            if(p[j] - p[i] >= dist){
                rem_ball--;
                i = j;
                if(rem_ball == 0){
                    ans = true;   
                }
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int positions[] = {5,4,3,2,1,1000000000};
        int m = 2;
        int ans = 0;
        Arrays.sort(positions);
        int low = 1;
        int high = positions[positions.length - 1] - positions[0];
        while(low <= high){
            int mid = low + (high - low)/2;
            boolean canbe = canPossible(positions, m, mid);
            if(canbe == true){
                ans = mid;
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        System.out.println(ans);
    }
}