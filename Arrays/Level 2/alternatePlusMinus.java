import java.util.*;

// public class alternatePlusMinus {
//     public static void main(String[] args) {
//         int arr[] = {3,1,-2,-5,2,-4};
//         ArrayList<Integer> ans = new ArrayList<>(Collections.nCopies(arr.length, 0));
//         int pos = 0;
//         int neg = 1;

//         for(int i = 0; i<arr.length; i++){
//             if(arr[i] > 0){
//                 ans.set(pos, arr[i]);
//                 pos += 2;
//             }
//             else{
//                 ans.set(neg, arr[i]);
//                 neg += 2;
//             }
//         }
//         System.out.println(ans);
//     }
// }

// if positives != negatives

public class alternatePlusMinus {
    public static void main(String[] args) {
        int arr[] = {-1,2,3,4,-3,1};
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > 0){
                pos.add(arr[i]);
            }
            else{
                neg.add(arr[i]);
            }
        }
        if(pos.size() > neg.size()){
            for(int i = 0; i<neg.size(); i++){
                arr[2*i] = pos.get(i);
                arr[2*i+1] = neg.get(i);
            }
            int index = neg.size() * 2;
            for(int i = neg.size(); i<pos.size(); i++){
                arr[index] = pos.get(i);
                index++;
            }
        }
        else{
            for(int i = 0; i<pos.size(); i++){
                arr[2*i] = pos.get(i);
                arr[2*i+1] = neg.get(i);
            }
            int index = pos.size() * 2;
            for(int i = pos.size(); i < neg.size(); i++){
                arr[index] = neg.get(i);
                index++; 
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
