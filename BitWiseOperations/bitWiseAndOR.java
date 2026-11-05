
import java.util.Arrays;
class bitWiseAndOR {
    public static void main(String[] args) {
        int a = 10;
        int b = 12;
        int x = a & b;
        int y = a | b;
        int ans[] = new int[2];
        ans[0] = a & b;
        ans[1] = a | b;
        String binary = Integer.toBinaryString(13);
        int count = 0;
        for(int i = 0; i<binary.length(); i++){
            if(binary.charAt(i) == '1'){
                count++;
            }
        }
        System.out.println(x);
        System.out.println(y);
        System.out.println(binary);
        System.out.println(count);
        System.out.println(Arrays.toString(ans));
    }
}
