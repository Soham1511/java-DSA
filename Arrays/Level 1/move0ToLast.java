import java.util.*;

// public class move0ToLast {
//     public static void main(String args[]){
        
//         int arr[] = {1,0,2,3,2,0,0,4,5,1};
//         ArrayList<Integer> temp = new ArrayList<>();

//         for(int i = 0; i<arr.length; i++){
//             if(arr[i] != 0){
//                 temp.add(arr[i]);
//             }
//         }
//         for(int i = 0; i<temp.size(); i++){
//             arr[i] = temp.get(i);
//         }
//         int nonZero = temp.size();
//         for(int i = nonZero; i<arr.length; i++){
//             arr[i] = 0;
//         }
//         System.out.println(Arrays.toString(arr));
//     }
// }

class optimal{
    public static void main(String args[]){

        int arr[] = {1,0,2,3,2,0,0,4,5,1};

        int j = -1;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == 0){
                j = i;
                break;
            }
        }
        if(j == -1) return;
        for(int i = j+1; i<arr.length; i++){
            if(arr[i] != 0){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
