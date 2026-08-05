class sortedOrNot{

    public static void main(String[] args) {
        @SuppressWarnings("unused")
        int arr[] = {1,2,2,3,3,4};
        
        for(int i = 1; i<=arr.length-1; i++){
            if(arr[i] >= arr[i-1]){
                
            }
            else{
                System.out.println("Unsorted");
            }
        }
        System.out.println("Sorted");
    }
}