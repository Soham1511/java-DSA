public class stoneGameIX {
    public static boolean stoneGame(int[] stones) {
        int rem0 = 0;
        int rem1 = 0;
        int rem2 = 0;
        for(int i = 0; i<stones.length; i++){
            if(stones[i] % 3 == 0) rem0++;
            else if(stones[i] % 3 == 1) rem1++;
            else rem2++;
        }
        if (rem0 % 2 == 0) {
            return rem1 > 0 && rem2 > 0;
        } else {
            return Math.abs(rem1 - rem2) > 2;
        }
    }
    public static void main(String[] args) {
        int a[] = {2};
        System.out.println(stoneGame(a));
    }
}
