import java.util.*;
public class climbingStairs {
    public static int fib(int n){
        if(n <= 1) return 1;
        return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of stairs");
        int n = sc.nextInt();
        System.out.println(fib(n));
    }
}
