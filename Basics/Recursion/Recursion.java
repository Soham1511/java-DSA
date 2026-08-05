import java.util.*;

class Recursion{

    static int count = 0;
    public static int fabionacciSer(int n){
        if(n<=1) return n;

        int last = fabionacciSer(n-1);
        int secLast = fabionacciSer(n-2);
        return last + secLast;
    }
    public static boolean isPalindrome(int i, String s){
        if(i >= s.length()/2){
            return true;
        }
        if(s.charAt(i) != s.charAt(s.length()-i-1)) return false;
        return isPalindrome(i+1, s);
    }
    public static void revArray(int arr [],int l, int r){
        if(l >= r){
            return;
        }
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        revArray(arr ,l+1, r-1);
    }
    public static int factorialOfN(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return n*factorialOfN(n-1);
    }
    public static int sumofNwithFunction(int n){
        if(n == 0){
            return 0;
        }
        return n + sumofNwithFunction(n-1);
    }
    public static void sumOfN(int i, int sum){
        if(i < 1){
            System.out.println(sum);
            return;
        }
        sumOfN(i-1, sum+i);
    }
    public static void printRevNumByUsingBackTracking(int i, int n){
        if(i > n){
            return;
        }
        printRevNumByUsingBackTracking(i+1, n);
        System.out.println(i);
    }
    public static void printUsingBackTracking(int i, int n){
        if(i < 1){
            return;
        }
        printUsingBackTracking(i-1, n);
        System.out.println(i);
    }
    public static void printRevNumbers(int n){
        if(n == 0) return;

        System.out.println(n);
        printRevNumbers(n-1);
    }
    public static void printNumbers(int n, int i){
        if(i>=n+1){
            return;
        }

        System.out.println(i);
        printNumbers(n, i+1);
    }
    public static void printName(String name){
        if(count == 108) return;
        System.out.println(name);
        count++;
        printName(name);
    }
    public static void main(String args[]){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        // String name = sc.nextLine();
        // printName(name);
        
        int n = sc.nextInt();
        // printNumbers(n,1);
        // printRevNumbers(n);
        // printUsingBackTracking(n, n);
        // printRevNumByUsingBackTracking(1, n);
        // sumOfN(n, 0);
        // System.out.println(sumofNwithFunction(n));
        // System.out.println(factorialOfN(n));

        // int arr[] = new int[]{7,3,8,2,6};
        // int length = arr.length;
        // revArray(arr, 0, length-1);
        // System.out.println(java.util.Arrays.toString(arr));
        // String s = sc.nextLine();
        // System.out.println(isPalindrome(0,s));
        System.out.println(fabionacciSer(n));

    }
}