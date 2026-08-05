import java.util.*;

public class subarraysWithSumK {
    public static void main(String[] args) {
        
        int arr[] = {1,2,3,-3,1,1,1,4,2,-3};
        int cnt = 0; 
        int n = arr.length;
        int target = 3;
        for(int i = 0; i<n ; i++){
            int sum = 0;
            for(int j = i; j<n; j++){
                sum = sum + arr[j];
                if(sum == target){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
