public class findMin {
    public static void main(String[] args){
        int[] arr = {30,40,50,60,70,5,10,20};
        int left = 0;
        int right = arr.length - 1;
        while(left < right){
            int mid = left + (right - left)/2;
            if(arr[right] < arr[mid]){
                left = mid + 1;
            }
            else if(arr[right] > arr[mid]){
                right = mid;
            }
        }
        System.out.println(arr[left]);
    }
}
