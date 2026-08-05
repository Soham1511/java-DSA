import java.util.*;

// public class threeSum {
//     @SuppressWarnings("unused")
//     public static void main(String[] args) {
//         int arr[] = {-1, 0, 1, 2, -1, -4};
//         Set<List<Integer>> st = new HashSet<>();
//         for(int i = 0; i<arr.length; i++){
//             for(int j = i+1; j<arr.length; j++){
//                 for(int k = j+1; k < arr.length; k++){
//                     if(arr[i] + arr[j] + arr[k] == 0){
//                         List<Integer> temp = new ArrayList<>();
//                         temp.add(arr[i]);
//                         temp.add(arr[j]);
//                         temp.add(arr[k]);
//                         Collections.sort(temp);
//                         st.add(temp);
//                     }
//                 }
//             }
//         }
//         List<List<Integer>> ans = new ArrayList<>(st);
//         System.out.println(ans);

//     }
// }

// public class threeSum {

//     @SuppressWarnings("unused")
//     public static void main(String[] args) {
//         int arr[] = { -1, 0, 1, 2, -1, -4 };
//         List<List<Integer>> ans = new ArrayList<>();
//         for (int i = 0; i < arr.length; i++) {
//             Set<Integer> st = new HashSet<>();
//             for (int j = i + 1; j < arr.length; j++) {
//                 int k = -(arr[i] + arr[j]);
//                 if (st.contains(k)) {
//                     if (k != arr[i] && k != arr[j] && arr[i] != arr[j]) {
//                         List<Integer> temp = new ArrayList<>();
//                         temp.add(arr[i]);
//                         temp.add(arr[j]);
//                         temp.add(k);
//                         Collections.sort(temp);
//                         if (!ans.contains(temp)) {
//                             ans.add(temp);
//                         }
//                     }
//                 }
//                 st.add(arr[j]);
//             }
//         }
//         System.out.println(ans);

//     }
// }


public class threeSum {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        int arr[] = {-1,0,1,2,-1,-4};
        int n = arr.length;
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i<arr.length; i++){
            if(i>0 && arr[i] == arr[i-1]) continue;
            int j = i+1;
            int k = n-1;
            while (j<k) {
                int sum = arr[i] + arr[j] + arr[k];
                if(sum < 0){
                    j++;
                }   
                else if(sum > 0){
                    k--;
                }
                else{
                    List<Integer> temp = new ArrayList<>();
                    temp.add(arr[i]);
                    temp.add(arr[j]);
                    temp.add(arr[k]);
                    ans.add(temp);
                    j++;
                    k--;
                    while (j<k && arr[j] == arr[j-1]) {
                        j++;
                    }
                    while (j<k && arr[k] == arr[k+1]) {
                        k--;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
