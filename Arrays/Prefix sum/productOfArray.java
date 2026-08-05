import java.util.*;
class productOfArray{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int arr[] = {1, 2, 3, 4}; 
        int n = arr.length;
        int totalProd = 1;
        for(int i = 0; i < n; i++){
            totalProd *= arr[i];
        }
        for(int i = 0; i<n; i++){
            int prod = totalProd / arr[i];
            list.add(prod);
        }
        System.out.println(list);
    }
}