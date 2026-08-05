public class findMissingNum {
    public static void main(String args[]){

        int arr[] = {1,2,4,5};
        int n = 5;
        int actualSum = n*(n+1) /2;
        int realSome = 0;

        for(int i = 0;i < arr.length; i++){
            realSome = realSome + arr[i];
        }
        int missingNumber = actualSum - realSome;
        System.out.println(missingNumber);
    }
}
