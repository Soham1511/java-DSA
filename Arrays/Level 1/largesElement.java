import java.util.*;
// sort an take last element (which is brute force)
class largestElement{
    
    public static void mergeSort(int arr[], int low, int high){
        if(low == high) return;
        int mid = (low+high)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        sort(arr,low,mid,high);
    }
    public static void sort(int arr[], int low, int mid, int high){
        int left = low;
        int right = mid+1;
        ArrayList<Integer> temp = new ArrayList<>();
        while (left <= mid && right <= high) {
            if(arr[left] <= arr[high]){
                temp.add(arr[left]);
                left++;
            }else{
                temp.add(arr[right]);
                right++;
            }
        }
        while (left<=mid) {
            temp.add(arr[left]);
            left++;
        }
        while (right<=high) {
            temp.add(arr[right]);
            right++;
        }
        for(int i = low; i<=high; i++){
            arr[i] = temp.get(i-low);
        }
    }
    @SuppressWarnings("unused")
    public static void main(String args[]){
        int arr[] = {3,2,1,5,2};
        int low = 0;
        int high = arr.length-1;
        mergeSort(arr, low, high);
        System.out.println("Sorting: "+Arrays.toString(arr));
        int largestElement = arr.length-1;
        System.out.println("Lagest Element: "+arr[largestElement]);
    }
}

// better solution for finding larges element.
public class largesElement {

    public static int largeEle(int arr[]){
        int large = arr[0];
        for(int i = 0; i<=arr.length-1; i++){
            if(arr[i] > large){
                large = arr[i];
            }
        }
        return large;
    }

    @SuppressWarnings("unused")
    public static void main(String args[]){
        int arr[] = {9,3,7,5,9,6};
        System.out.println(largeEle(arr));
    }
}