class obtainMaxPoints{
    public static int findSum(int c[]){
        int sum = 0;
        for(int i = 0; i<c.length; i++){
            sum += c[i];
        }
        return sum;
    }
    public static boolean canPossible(int c[], int mid, int k){
        int sum = 0;
        int l = 0;
        int r = c.length - 1;
        while(l < r){
            if(c[l] == c[r]){
                if(c[l+1] <= c[r-1]){
                    sum += c[r];
                    r--;
                    k--;
                    if(k == 0) return sum >= mid;
                }
                else{
                    sum += c[l];
                    l++;
                    k--;
                    if(k == 0) return sum >= mid;
                }
            }
            else if(c[l] < c[r]){
                sum += c[r];
                r--;
                k--;
                if(k == 0) return sum >= mid;
            }
            else{
                sum += c[l];
                l++;
                k--;
                if (k == 0) return sum >= mid;
            }
        }
        return sum >= mid;
    }
    public static void main(String[] args){
        int cardPoints[] = {1000,1,1000,1,1000,1,1000};
        int k = 5;
        int ans = 0;
        int left = 1;
        int right = findSum(cardPoints);
        if(cardPoints.length == k){
            System.out.println(findSum(cardPoints));
        }
        else{
            while(left <= right){
                int mid = left + (right - left)/2;
                if(canPossible(cardPoints, mid, k) == true){
                    ans = mid;
                    left = mid + 1;
                }
                else{
                    right = mid - 1;
                }
            }
            System.out.println(ans);
        }
    }
}