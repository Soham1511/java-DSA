import java.util.Arrays;

class insertionSort{
    @SuppressWarnings("unused")
    public static void main(String args[]){
        int arr[] = {4,1,5,2,3};

        for(int i = 1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;

            while(prev >= 0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
        System.out.println(Arrays.toString(arr));
    }
}