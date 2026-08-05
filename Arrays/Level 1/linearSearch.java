public class linearSearch {

    public static int linear(int arr[], int n){
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == n){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        @SuppressWarnings("unused")
        int arr[] = {6,7,8,4,1};
        int n = 4;
        int indexOfElement = linear(arr, n);
        System.out.println(indexOfElement);
    }   
}
