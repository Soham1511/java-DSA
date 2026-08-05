import java.util.*;
public class mejorityElement {

    public static void main(String args[]){

        int arr[] = {1};
        int n = arr.length;
        int element = 0;
        int count = 0;
        List<Integer> ans = new ArrayList<>();

        for(int i = 0; i<n; i++){
            if(count == 0){
                count = 1;
                element = arr[i];
            }
            else if(arr[i] == element){
                count++;
                if(count > n/3){
                    ans.add(element);
                }
            }
    
            // else{
            //     count--;
            // }
        }
        System.out.println(ans);
    }
}