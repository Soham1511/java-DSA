//  import java.util.*;

// public class sort0and1 {

//     public static void mergeSort(int arr[], int low, int high) {
//         if(low == high) return;
//         int mid = (low + high) / 2;
//         mergeSort(arr, low, mid);
//         mergeSort(arr, mid + 1, high);
//         merge(arr, low, high, mid);
//     }

//     public static void merge(int arr[], int low, int high, int mid) {
//         ArrayList<Integer> temp = new ArrayList<>();
//         int left = low;
//         int right = mid + 1;

//         while (left <= mid && right <= high) {
//             if (arr[left] <= arr[right]) {
//                 temp.add(arr[left]);
//                 left++;
//             } else {
//                 temp.add(arr[right]);
//                 right++;
//             }
//         }
//         while (left <= mid) {
//             temp.add(arr[left]);
//             left++;
//         }
//         while (right <= high) {
//             temp.add(arr[right]);
//             right++;
//         }
//         for(int i = low; i<=high; i++){
//             arr[i] = temp.get(i-low);
//         }
//     }

//     public static void main(String args[]) {
//         int arr[] = { 0, 1, 2, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
//         // int n = arr.length;
//         int low = 0;
//         int high = arr.length - 1;
//         mergeSort(arr, low, high);
//         System.out.println(Arrays.toString(arr));
//     }
// }  TC = n log n and SC = N

//Better soln:

// import java.util.ArrayList;

// class sort0and1{
//     public static void main(String args[]){
//         int arr[] = { 0, 1, 2, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
//         ArrayList<Integer> sortArr = new ArrayList<>();
//         int count0 = 0;
//         int count1 = 0;
//         int count2 = 0;
//         for(int i = 0; i<arr.length; i++){
//             if(arr[i] == 0){
//                 count0++;
//             }else if(arr[i] == 1){
//                 count1++;
//             }else{
//                 count2++;
//             }
//         }
//         for(int i = 0; i<count0; i++){
//             sortArr.add(0);
//         }
//         for(int i = count0; i<count0+count1; i++){
//             sortArr.add(1);
//         }
//         for(int i = count0+count1; i<count0+count1+count2; i++){
//             sortArr.add(2);
//         }
//         System.out.println(sortArr);
//     }
// }

// Dutch National Flag Algo
import java.util.*;

class sort0and1{
    public static void main(String args[]){
        int arr[] = {0,1,1,0,1,2,1,2,0,0};
        int mid = 0;
        int low = 0;
        int n = arr.length-1;
        int high = n;

        while(mid <= high){
            if(arr[mid] == 0){
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            }
            else if(arr[mid] == 1){
                mid++;
            }
            else{
                int temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;
                high--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}