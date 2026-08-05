import java.util.Arrays;

public class selectionSort {

    public static void main(String args[]){
        int arr[] = {13,46,24,52,20,9};
        for(int i = 0; i<arr.length-1; i++){
            int mini = i;
            for(int j = i+1; j<arr.length; j++){
                if(arr[j]<arr[mini]){
                    mini = j;
                }
            }
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}