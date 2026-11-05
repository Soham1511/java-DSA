import java.util.*;
class maximumKtoSort{
    public static int findMaxPairAND(HashSet<Integer> set) {
        int res = 0;
        for (int bit = 30; bit >= 0; bit--) {
            int candidate = res | (1 << bit);
            int count = 0;
            for (int num : set) {
                if ((num & candidate) == candidate) {
                    count++;
                }
            }
            if (count >= 2) {
                res = candidate;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int a[] = {4,0,1,2};
        int sorted[] = a.clone();
        Arrays.sort(sorted);
        int k = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i<a.length; i++){
            if(a[i] != sorted[i]){
                set.add(a[i]);
            }
        }
        k = findMaxPairAND(set);
        System.out.println(k);
        System.out.println(set);
    }
}