import java.util.*;

class list {
    public static void main(String[] args) {

        int arr[] = {10, 5, 2, 6};
        int k = 100;

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            int product = 1;
            ArrayList<Integer> current = new ArrayList<>();

            for (int j = i; j < arr.length; j++) {

                product *= arr[j];

                if (product < k) {
                    current.add(arr[j]);

                    ans.add(new ArrayList<>(current));
                } else {
                    break;
                }
            }
        }
        int size = ans.size();
        System.out.println("Total number of subarrays: " + size);
        System.out.println(ans);
    }
}