import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class subarray{
    public static void main(String[] args) {
        int a[] = {1,2,1};
        ArrayList<List<Integer>> list = new ArrayList<>();
        for(int i = 0; i<a.length; i++){
            for(int j = i; j<a.length; j++){
                List<Integer> currList = new ArrayList<>();
                for(int k = i; k<=j; k++){
                    currList.add(a[k]);
                }
                list.add(currList);
            }
        }
        int sq = 0;
        for(List<Integer> subarray : list){
            if(subarray.size() == 1){
                sq += 1 * 1;
            }
            else {
                HashMap<Integer, Integer> map = new HashMap<>();
                for(int num : subarray){
                    map.put(num, map.getOrDefault(num, 0) + 1);
                }
                sq += map.size() * map.size();
            }
        }
        System.out.println(list);
        System.out.println(sq);
    }
}