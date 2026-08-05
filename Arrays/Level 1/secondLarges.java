class secondLarges{

    public static int secondLargest(int arr[]){
        int largest = arr[0];
        int secondLargest = -1;
        for(int i = 0; i<=arr.length-1; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        for(int i = 0; i<=arr.length-1; i++){
            if(arr[i] > secondLargest && arr[i] != largest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    @SuppressWarnings("unused")
    public static void main(String args[]){
        int arr[] = {1,2,4,7,7,5};
        int secLargest = secondLargest(arr);
        System.out.println(secLargest);
    }
}
