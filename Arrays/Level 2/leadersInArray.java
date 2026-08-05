import java.util.*;

// public class leadersInArray {
//     public static void main(String[] args) {
//         int arr[] = {10,22,12,3,0,6};
//         int n = arr.length;
//         ArrayList<Integer> ans = new ArrayList<>();
//         for(int i = 0; i<n ; i++){
//             Boolean leader = true;
//             for(int j = i+1; j<n ; j++){
//                 if(arr[j] > arr[i]){
//                     leader = false;
//                     break;
//                 }
//             }
//             if(leader == true){
//                 ans.add(arr[i]);
//             }
//         }

//         System.out.println(ans);
//     }
// }

public class leaders {

    public static void main(String[] args) {
        int arr[] = {10,22,12,3,0,6};
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for(int i = n-1; i>=0; i--){
            if(arr[i] > max){
                ans.add(arr[i]);
                max = arr[i];
            }
        }
        Collections.reverse(ans);
        System.out.println(ans);
    }
}
