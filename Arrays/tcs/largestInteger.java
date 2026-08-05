import java.util.*;
public class largestInteger {
    public static void main(String args[]){
        int arr[] = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<arr.length; i++){
            for(int j = i+k-1; j<arr.length; j++){
                if(j-i == 2){
                    if(arr[i] > arr[i+1] && arr[i] > arr[j]){
                        list.add(arr[i]);
                    }
                    else if(arr[i+1] > arr[i] && arr[i+1] > arr[j]){
                        list.add(arr[i+1]);
                    }
                    else{
                        list.add(arr[j]);
                    }
                }
            }
        }
        System.out.println(list);
    }
}
