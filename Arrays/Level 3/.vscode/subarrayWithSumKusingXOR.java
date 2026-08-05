import java.util.*;

public class subarrayWithSumKusingXOR {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        
        int arr[] = {4,2,2,6,4};
        int n = arr.length;
        int cnt = 0;
        int target = 6; 
        for(int i = 0; i<n; i++){
            int xor = 0;
            for(int j = i; j<n ; j++){
                xor = xor ^ arr[j];
                if (xor == target) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
