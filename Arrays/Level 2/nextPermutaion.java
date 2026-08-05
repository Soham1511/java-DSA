import java.util.*;

public class nextPermutaion {
    public static List nextPermutationAns(List<Integer> a){
        int index = -1; 
        int n = a.size();
        for(int i = n-2; i>=0; i--){
            if(a.get(i) < a.get(i+1)){
                index = i;
                break;
            }
        }
        if(index == -1){
            Collections.reverse(a);
            return a;
        }

        for(int i = n-1; i > index; i--){
            if(a.get(i) > a.get(index)){
                int temp = a.get(i);
                a.set(i, a.get(index));
                a.set(index, temp);
                break;
            }
        }

        List<Integer> sorted = a.subList(index+1, n);
        Collections.reverse(sorted);
        return a;
    }
    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(new Integer[] { 3,5,4,9,7,6,2});

        List<Integer> ans = nextPermutationAns(a);
        System.out.println(ans);
    }
}