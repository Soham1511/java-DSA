import java.util.*;
class maths{
    public static int findGCD(int n1, int n2){
        int gcd = 1;
        for(int i = 1; i<= Math.min(n1, n2); i++){
            if(n1 % i == 0 && n2 % i == 0){
                gcd = i;
            }
        }
        return gcd;
    }
    public static boolean primeOrNot(int n){
        int counter = 0;
        for(int i = 1; i<=n; i++){
            if(n % i == 0){
                counter++;
            }
        }
        if (counter == 2) {
            return true;
        }
        return false;
    }
    public static void printAllDivisors(int n){
        List<Integer> l = new ArrayList<>();
        for(int i = 1; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                l.add(i);
                if(n/i != i){
                    l.add(n/i);
                }
            }
        }
        Collections.sort(l);
        for(int divisor : l){
            System.out.print(divisor + " ");
        }
    }
    public static boolean checkArmstrong(int n){
        int temp = n;
        int sum = 0;
        boolean isArmstrong = false;
        while (n > 0) {
            int ld = n % 10;
            n = n/10;
            int cube = ld * ld * ld;
            sum = sum + cube;
        }
        if (sum == temp) {
            return isArmstrong = true;
        }
        return isArmstrong;
    }
    public static boolean checkPalindrome(int n){
        int temp = n; // temp = 131.
        int rev = 0;
        while (n>0) {
            int lastDigit = n%10; // 131%10 = 1,3,1
            n = n/10; // 131/10 = 13, 1
            rev = (rev*10)+lastDigit;
            if(temp == rev){
                return true;
            }
        }
        return false;
    }
    public static int revNumber(int n){
        int revNum = 0;
        while(n>0){
            int lastDigit = n % 10;
            n = n/10;
            revNum = (revNum * 10) + lastDigit;
        }
        return revNum;
    }
    public static int countNumber(int n){
        int count = 0;
        while (n>0) {
            n = n/10;
            count = count+1;
        }
        return count++;
    }
    public static void main(String args[]){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        // System.out.println(countNumber(n));
        // System.out.println(revNumber(n));
        // System.out.println(checkPalindrome(n));
        // System.out.println(checkArmstrong(n));
        // printAllDivisors(n);
        // primeNumbers(n);
        // System.out.println(primeOrNot(n));
        System.out.println(findGCD(n1, n2));
    }
}