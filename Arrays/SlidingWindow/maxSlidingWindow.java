import java.util.*;
public class maxSlidingWindow {
    public static void main(String[] args) {
        int arr[] = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;
        int left = 0;
        int oldMax = Integer.MIN_VALUE;
        int maxWindowElement = Integer.MIN_VALUE;
        for(int right = k-1; right < n; right++){
            if(oldMax == Integer.MIN_VALUE || arr[left-1] == oldMax){
                while(left <= right){
                    maxWindowElement = Math.max(maxWindowElement, arr[left]);
                    oldMax = maxWindowElement;
                    left++;
                }
                list.add(maxWindowElement);
            }
            else{
                maxWindowElement = Math.max(oldMax, arr[right]);
                oldMax = maxWindowElement;
                list.add(maxWindowElement);
            }
        }
            int ans[] = new int[list.size()];
            for(int i = 0; i < list.size(); i++){
                ans[i] = list.get(i);
            }
        System.out.println(Arrays.toString(ans));
     }
}
