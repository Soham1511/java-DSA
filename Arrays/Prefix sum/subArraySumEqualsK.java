
public class subArraySumEqualsK {
    public static void main(String[] args){
        int arr[] = {3, 4, 7, 2, -3, 1, 4, 2};
        int k = 7;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        int count = 0;
        for(int i = 1; i < arr.length; i++){
            prefix[i] = prefix[i - 1] + arr[i];
            if(prefix[i] == k){
                count++;
            }
        }
        int suffix[] = new int[arr.length];
        suffix[arr.length - 1] = 0; //3
        for(int i = arr.length - 2; i >= 0; i--){
            suffix[i] = suffix[i + 1] + arr[i+1];
            if(suffix[i] == k){
                count++;
            }
        }
        System.out.println(count);
    }
}
