import java.util.Arrays;

class bubbleSort{

    @SuppressWarnings("unused")
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6};

        for(int i = arr.length - 1; i >= 1; i--){
            int didSwap = 0;
            for(int j = 0; j<=i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[i];
                    arr[i] = temp;
                    didSwap = 1;
                }
            }
            if(didSwap == 0){
                break;
            }
            System.out.println("runs");
        }
        System.out.println(Arrays.toString(arr));
    }
}