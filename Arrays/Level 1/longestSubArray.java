// public class longestSubArray {
//     public static void main(String args[]){
//         int arr[] = {10, 5, 2, 7, 1, -10};
//         int k = 15;
//         int returnLenth = 0;

//         for(int i = 0; i<arr.length; i++){
//             int sum = 0;
//             for(int j = i;j < arr.length;j++){
//                 sum = sum + arr[j];
//                 if(sum == k){
//                     returnLenth = Math.max(returnLenth, j-i+1);
//                 }
//             }
//         }
//         System.out.println(returnLenth);
//     }
// }

// better approach 

class longestSubArr{
    public static void main(String args[]){

        int arr[] = {1,2,3,1,1,1,1,3,3};
        int k = 6;
        int sum = arr[0];
        int len = 0;
        int left = 0;
        int right = 0;

        while(right < arr.length){
            while(left <= right && sum > k){
                sum = sum-arr[left];
                left++;
            }
            if(sum == k){
                len = Math.max(len, right-left+1);
            }
            right++;
            if(right<arr.length) sum = sum + arr[right];
        }
        System.out.println(len);
        
    }
}
