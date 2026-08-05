import java.util.*;

// class rightRotate{

//     public static void main(String args[]){

//         @SuppressWarnings("unused")
//         int arr[] = {1,2,3,4,5,6,7};
//         int n = arr.length;
//         int k = 3;

//         k = k%n;
//         ArrayList<Integer> temp = new ArrayList<>();

//         //last 3 elements in temp
//         for(int i = n-k; i<n; i++){
//             temp.add(arr[i]);
//         }

//         //shift first n-k elements to last
//         for(int i = n-k-1; i>=0 ; i--){
//             arr[i+k] = arr[i];
//         }

//         //getback elements from temp
//         for(int i = 0; i<k;i++){
//             arr[i] = temp.get(i);
//         }

//         System.out.println(Arrays.toString(arr));
        
//     }
// }


//more optimal approach....

class optiRightRotate{
    public static void reverse(int arr[], int start, int end){
        while (start<=end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String args[]){

        int arr[] = {2,3,4,5,6,7,8};
        int k = 3;
        int n = arr.length;
        k = k%n;
        reverse(arr,0, n-k-1);
        reverse(arr, n-k, n-1);
        reverse(arr, 0, n-1);
        System.out.println(Arrays.toString(arr));
    }
}