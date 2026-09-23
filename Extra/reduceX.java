public class reduceX {
    public static int findSum(int arr[]){
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[] = {3,2,20,1,1,3};
        int x = 10;
        int i = 0;
        int totalSum = findSum(arr);
        int sum = 0;
        int remSum = totalSum - x;
        int length = 0;
        for(int j = 0; j<arr.length; j++){
            sum += arr[j];
            while (sum > remSum && i<=j) {
                sum -= arr[i];
                i++;
            }
            if(sum == remSum){
                length = Math.max(length, j - i + 1);
            }
        }
        if (length == 0) {
            System.out.println(-1);
        }
        else{
            System.out.println(arr.length - length);
        }
    }
}
