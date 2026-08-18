import java.util.HashMap;

class largestMissingNum{
    public static void main(String[] args) {
        int a[] = {3,9,2,1,7};
        int k = 3;
        int n = a.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<n; i++){
            int left = Math.max(0, i - k + 1);
            int right = Math.min(i, n - k);
            int freq = right - left + 1;
            map.put(a[i], map.getOrDefault(a[i], 0) + freq);
        }
        
        System.out.println(map);
        int largest = 0;
        for(int i = 0; i<a.length; i++){
            if(map.get(a[i]) == 1){
                largest = Math.max(largest, a[i]);
            }
        }
        System.out.println(largest);
    }
}