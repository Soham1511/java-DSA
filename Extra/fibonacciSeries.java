import java.util.*;
public class fibonacciSeries {
    public static void fib(int n){
        int a = 0; int b = 1;
        for(int i = 0; i<n; i++){
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }

    }
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        fib(n);
    }
}
