import java.util.*;
class ReduceNumberToZero{
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        int total_steps = 0;
        while (n!=0) {
            if(n%2 == 0){
                n = n/2;
                total_steps += 1;
            }
            if(n%2 != 0){
                n = n-1;
                total_steps += 1;
            }
        }
        System.out.println("Total steps needed to reduce: "+total_steps);

    }
}