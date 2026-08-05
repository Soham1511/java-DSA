import java.util.*;

public class removeDupe {

    public static void main(String args[]){
        @SuppressWarnings("unused")
        int arr[] = {1,1,2,2,2,3,3,3};
        Set<Integer> uniqueEle = new HashSet<>();
        for(int i = 1; i<=arr.length-1; i++){
            if(arr[i] == arr[i-1]){
                uniqueEle.add(arr[i]);
            }
        }
        System.out.println(uniqueEle);
        System.out.println(uniqueEle.size());
    }
}