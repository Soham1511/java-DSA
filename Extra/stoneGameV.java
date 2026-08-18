public class stoneGameV {
    public static void main(String[] args) {
        int a[] = {6,2,3,4,5,5};
        int l = 0;
        int r = a.length - 1;
        int n = a.length;
        int lSum = 0;
        int rSum = 0;
        int Alice = 0;
        while(l < r || l < n/2 || r >= n/2){
            lSum += a[l];
            rSum += a[r];
            l++;
            r--;
            if(r - l == 1){
                if(lSum < rSum){
                    Alice += lSum;
                }
                else if(rSum < lSum){
                    Alice += rSum;
                }
                else{
                    Alice += lSum;
                }
            }
        }
        System.out.println(Alice);
    }
}
