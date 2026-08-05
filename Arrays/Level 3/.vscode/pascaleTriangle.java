
// Q1 given R = 5, C = 3; return the number on that position
public class pascaleTriangle {

    public static int findNumber(int n, int r) {
        int res = 1;
        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }
        return res;
    }

    public static void main(String[] args) {
        int r = 5;
        int c = 3;

        int number = findNumber(r - 1, c - 1);
        System.out.println(number);
    }
}

