
public class squaredDiff {

    public static void main(String[] args) {
        int a[] = {1, 4, 10, 12};
        int b[] = {5, 8, 6, 9};

        int k1 = 1;
        int k2 = 1;
        int k = k1 + k2;

        int diff[] = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            diff[i] = Math.abs(a[i] - b[i]);
        }

        while (k > 0) {
            int maxIndex = 0;

            for (int i = 1; i < diff.length; i++) {
                if (diff[i] > diff[maxIndex]) {
                    maxIndex = i;
                }
            }

            if (diff[maxIndex] == 0) {
                break;
            }

            diff[maxIndex]--;
            k--;
        }

        long sqDiff = 0;

        for (int d : diff) {
            sqDiff += (long) d * d;
        }

        System.out.println("Minimum sum: " + sqDiff);
    }
}
