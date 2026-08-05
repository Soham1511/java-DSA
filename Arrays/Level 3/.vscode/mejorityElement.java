import java.util.*;

// public class mejorityElement {
//     @SuppressWarnings("unused")
//     public static void main(String[] args) {
        
//         int arr[] = {1,1,1,3,3,2,2,2};
//         int mejority = arr.length / 3; // 8/3 = 2
//         List<Integer> ans = new ArrayList<>();
        
//         for(int i = 0; i<arr.length; i++){
//             int cnt = 0;
//             int element = arr[i];
//             if(ans.contains(element)) continue;
//             for(int j = 0; j<arr.length; j++){
//                 if(arr[j] == element){
//                     cnt += 1;
//                 }
//             }
//             if(cnt > mejority){
//                 ans.add(element);
//             }
//         }
//         System.out.println(ans);
//     }
// }

public class mejorityElement {

    public static void main(String[] args) {
        int arr[] = {2,2};
        List<Integer> ans = new ArrayList<>();  
        int mejority = arr.length/3;
        Map<Integer, Integer> mpp = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            int val = mpp.getOrDefault(arr[i], 0);
            mpp.put(arr[i],val+1);

            if(mpp.get(arr[i]) > mejority && !ans.contains(arr[i])){
                ans.add(arr[i]);
            }
            if(ans.size() == 2) break;
        }
        System.out.println(ans);

    }
}
