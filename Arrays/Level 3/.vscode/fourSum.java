import java.util.*;

// public class fourSum {
//     @SuppressWarnings("unused")
//     public static void main(String[] args) {
        
//         int arr[] = {1,0,-1,0,-2,2};
//         Set<List<Integer>> st = new HashSet<>();
//         int n = arr.length;

//         for(int i = 0; i<n; i++){
//             for(int j = i+1; j<n; j++){
//                 for(int k = j+1; k<n; k++){
//                     for(int l = k+1; l<n; l++){
//                         if(arr[i] + arr[j] + arr[k] + arr[l] == 0){
//                             List<Integer> temp = new ArrayList<>();
//                             temp.add(arr[i]);
//                             temp.add(arr[j]);
//                             temp.add(arr[k]);
//                             temp.add(arr[l]);
//                             Collections.sort(temp);
//                             st.add(temp);
//                         }
//                     }
//                 }
//             }
//         }
//         List<List<Integer>> ans = new ArrayList<>(st);
//         System.out.println(ans);
//     }
// }

public class fourSum {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        int arr[] = {1,0,-1,0,-2,2};
        Arrays.sort(arr);
        int n = arr.length;
        int target = 8;
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i<n; i++){
            if(i>0 && arr[i] == arr[i-1]) continue;
            for(int j = i+1; j<n; j++){
                if(j > i+1 && arr[j] == arr[j-1]) continue;
                int k = j+1;
                int l = n-1;
                while(k<l){
                    int sum = arr[i] + arr[j] + arr[k] + arr[l];
                    if(sum < target){
                        k++;
                    }
                    else if(sum > target){
                        l--;
                    }
                    else{
                        List<Integer> temp = new ArrayList<>();
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[k]);
                        temp.add(arr[l]);
                        ans.add(temp);
                        k++;
                        l--;
                        while(k<l && arr[k] == arr[k-1]) k++;
                        while(k<l && arr[l] == arr[l+1]) l--;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
