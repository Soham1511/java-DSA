import java.util.*;

class leftRotateArray{

    public static void main(String args[]){

        @SuppressWarnings("unused")
        int arr[] = {1,2,3,4,5,6,7};
        int n = arr.length;
        int k = 3;

        //pushing first k elements to the last/in other array
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i = 0; i<=k-1; i++){
            temp.add(arr[i]);
        }

        // shifting
        for(int i = k; i<n; i++){
            arr[i-k] = arr[i];
        }

        //the elements in temp[] needs to get back in og array
        for(int i = n-k; i<n; i++){
            arr[i] = temp.get(i-(n-k));
        }

        System.out.println(Arrays.toString(arr));

    }
}