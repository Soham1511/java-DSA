import java.util.*;
public class binaryRepresentation {
    public static void main(String args[]){
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        String s = "";
        while(n > 0){
            int temp = (n & 1);
            s = temp + s;
            n = n >> 1;
        }
        System.out.println(s);

        sc.close();
    }
}
