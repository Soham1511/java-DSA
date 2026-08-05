public class maxConsecutiveOne {
    public static void main(String args[]){

        int arr[] = {1,1,1,1,0,1,1,1};
        int n = arr.length;
        int counter = 0;
        int max1 = 0;

        for(int i = 0; i<n ; i++){
            if(arr[i] == 1){
                counter++;
                if(counter != max1 && counter > max1){
                    max1++;
                }
            }else{
                counter = 0;
            }
            
        }
        System.out.println(counter);

    }
}
