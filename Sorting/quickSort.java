import java.util.Arrays;

class quickSort {

    public static void quickSrt(int arr[], int low, int high) {
        if (low < high) {
            int pivetIndex = sort(arr, low, high);
            quickSrt(arr, low, pivetIndex - 1);
            quickSrt(arr, pivetIndex + 1, high);
        }
    }

    public static int sort(int arr[], int low, int high) {
        int pivot = arr[low];
        int i = low + 1;
        int j = high;
        while (i <= j) {
            while (i <= high && arr[i] <= pivot ) {
                i++;
            }
            while (j >= low && arr[j] > pivot) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        arr[low] = arr[j];
        arr[j] = pivot;
        return j;
    }

    @SuppressWarnings("unused")
    public static void main(String args[]) {
        int arr[] = { 4, 6, 4, 5, 7, 9, 1, 3 };
        int low = 0;
        int high = arr.length - 1;
        quickSrt(arr, low, high);
        System.out.println(Arrays.toString(arr));
    }
}