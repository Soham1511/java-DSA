import java.util.*;
class bitwiseOperations{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int a = sc.nextInt();
        boolean result = false;
        if(a <= 0) result = false;
        else if(a == 1) result = true;
        else if((a & a/2) == 0){
            result = true;
        }
        else{
            result = false;
        }
        System.out.println("Is power of 4: " + result);
    }
}