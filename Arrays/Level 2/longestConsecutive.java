import java.util.*;

// public class longestConsecutive {

//     public static boolean findNumm(int arr[], int num){
//         for(int i = 0; i<arr.length;i++){
//             if(arr[i] == num){
//                 return true;
//             }
//         }
//         return false;
//     }
//     public static void main(String[] args) {
//         int arr[] = {102, 4, 100, 1, 101, 3, 2, 1, 1};
//         int n = arr.length;
//         int maxStreak = 0;

//         for(int i = 0; i<n; i++){
//             int currentStreak = 1;
//             int currentNum = arr[i];
//             while (findNumm(arr, currentNum + 1)) {
//                 currentNum = currentNum + 1;
//                 currentStreak++;
//             }
//             if(currentStreak > maxStreak){
//                 maxStreak = currentStreak;
//             }

//         }
//         System.out.println(maxStreak);
//     }
// }

public class BetterLongestConsecutive {


    public static void main(String[] args) {
        Integer arr[] = {100, 102, 100, 101, 101, 4, 3, 2, 5, 3, 2, 1, 1, 1, 2};
        
        int n = arr.length;
        HashSet<Integer> set = new HashSet<>();
        int longest = 1;
        
        for(int i = 0; i<n; i++){
            set.add(arr[i]);
        }
        
        for(int it : set){
            if(!set.contains(it-1)){
                int cnt = 1;
                int x = it;
                while (set.contains(x+1)) {
                    x = x+1;
                    cnt = cnt+1;
                }
                longest = Math.max(longest, cnt);
            }
        }

        System.out.println(longest);
    }
}
