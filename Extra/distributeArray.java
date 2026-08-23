import java.util.ArrayList;
import java.util.Arrays;

class distributeArray{
    public static void main(String[] args) {
        int arr[] = {5,4,3,8,2,9,6};
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        for(int i = 0; i<arr.length; i++){
            if(i == 0){
                l1.add(arr[i]);
            }
            else if(i == 1){
                l2.add(arr[i]);
            }
            else{
                if(l1.get(l1.size() - 1) > l2.get(l2.size() - 1)){
                    l1.add(arr[i]);
                }
                else{
                    l2.add(arr[i]);
                }
            }
        }
        l1.addAll(l2);
        int result[] = l1.stream().mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(result));
    }
}