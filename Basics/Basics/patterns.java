import java.util.*;

class patterns{
    public static void pattern(int n){
        for(int i = 0 ; i<n; i++){
            for(int j = 0; j<n-i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j<2*i; j++){
                System.out.print("*");
            }
            for(int j = 0; j<n-i; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void printPatterns(int n){
        for(int i = 0; i<n; i++){
            for(int j = 0; j< n-i; j++){
                System.out.print(' ');
            }
            for(int j = 0; j<2*i-1; j++){
                System.out.print('*');
            }
            for(int j = 0; j< n-i; j++){
                System.out.print(' ');
            }
            System.out.println();
        }
        for (int i = 0; i<n; i++){
            for(int j = 0; j<i; j++){
                System.out.print(' ');
            }
            for(int j = 0; j<2*n-(2*i+1); j++){
                System.out.print('*');
            }
            for(int j = 0; j<i; j++){
                System.out.print(' ');
            }
            System.out.println();
        }
    }
    public static void trickyPattern(int n){
        for(int i = 1; i<=2*n-1; i++){
            int stars = i;
            if(i>n) stars = 2*n-i;
            for(int j = 1; j<=stars; j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
    public static void trickyPattern2(int n){
        int start = 1;
        for(int i = 0; i< n; i++){
            if(i % 2== 0) start =1;
            else start = 0;
            for(int j = 0; j<=i ; j++){
                System.out.print(start);
                start = 1-start;
            }
            System.out.println();
        }
    }
    public static void trickyPattern3(int n){
        int space = 2*(n-1);
        for(int i = 1; i<=n ; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(j);
            }
            for(int j = 1; j<=space; j++){
                System.out.print(' ');
            }
            for(int j = i; j>=1; j--){
                System.out.print(j);
            }
            System.out.println();
            space -= 2;
        }
    }
    public static void trickyPattern4(int n){
        int num = 1;
        for(int i = 1; i<=n ; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(num);
                num = num+1;
            }
            System.out.println();
        }
    }
    public static void nStarTriangle(int n) {
        for(int i = 1; i<=n ; i++){
            // space
            for(int j = 1; j<i; j++){
                System.out.print(" ");
            }
            //star
            for(int j = 1; j<=(2*(n-i)+1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int n;
        try (Scanner sc = new Scanner(System.in)) {
            n = sc.nextInt();
        }
        // printPatterns(n);
        // trickyPattern4(n);
        // pattern(n);
        nStarTriangle(n);
    }
}