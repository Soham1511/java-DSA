import java.util.Arrays;

class defuseBomb{
    public static void main(String[] args) {
        int a[] = {5,7,1,4};
        int k = 3;
        int ans[] = new int[a.length];
        for(int i = 0; i<a.length; i++){
            int sum = 0;
            int j = i + k;
            while(j > i){
                sum += a[j % a.length];
                j--;
            }
            ans[i] = sum;
        }
        System.out.println(Arrays.toString(ans));
        int b[] = {2,4,9,3};
        int k2 = -2;
        int ans2[] = new int[b.length];
        for(int i = b.length*2-1; i >= b.length; i--){
            int sum = 0;
            int j = i + k2;
            while(j < i){
                sum += b[j % b.length];
                j++;
            }
            ans2[i % b.length] = sum;
        }
        System.out.println(Arrays.toString(ans2));
    }
}