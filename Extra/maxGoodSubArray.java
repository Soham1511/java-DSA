import java.util.*;
class maxGoodSubArray{
    public static void main(String[] args) {
        int arr[] = {1,2,2,2,3,3,4};
        int k = 1;
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLen = 0;
        int i = 0;
        for(int j = 0; j < arr.length; j++){
            map.put(arr[j], map.getOrDefault(arr[j], 0) + 1);
            if(map.get(arr[j]) > k){
                while(map.get(arr[j]) > k){
                    map.put(arr[i], map.get(arr[i]) - 1);
                    i++;
                }
            }
            maxLen = Math.max(maxLen, j - i + 1);
        }
        System.out.println(maxLen);
    }
}