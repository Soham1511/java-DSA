import java.util.*;
// public class union {
//     public static void main(String args[]){

//         int arr1[] = {1,1,2,3,5};
//         int arr2[] = {2,3,4,4,5,6};

//         HashSet<Integer> set = new HashSet<>();
//         for(int i = 0; i< arr1.length; i++){
//             set.add(arr1[i]);
//         }
//         for(int i = 0; i<arr2.length; i++){
//             set.add(arr2[i]);
//         }
//         System.out.println(set);
//         System.out.println(set.size());
//     }
// }

class optimalUnion{
    public static void main(String args[]){
        int a[] = {1,1,2,3,5};
        int b[] = {2,3,4,4,5,6}; 
        int i = 0;
        int j = 0;
        int a1 = a.length;
        int b1 = b.length;
        ArrayList<Integer> union = new ArrayList<>();
        while(i < a1 && j < b1){
            if(a[i] <= b[j]){
                if(union.size()==0 || !union.contains(a[i])){
                    union.add(a[i]);
                }
                i++;
            }
            else{
                if(union.size() == 0 || !union.contains(b[j])){
                    union.add(b[j]);
                }
                j++;
            }
        }
        while (i<a1) {
            if(union.size()==0 || !union.contains(a[i])){
                union.add(a[i]);
            }
            i++;
        }
        while (j<b1) {
            if(union.size() == 0 || !union.contains(b[j])){
                union.add(b[j]);
            }
            j++;
        }
        System.out.println(union);
    }
}
