class makeBouquets {
    public static int findLow(int b[]) {
        int low = Integer.MAX_VALUE;
        for (int i = 0; i < b.length; i++) {
            if (b[i] < low) {
                low = b[i];
            }
        }
        return low;
    }

    public static int findHigh(int b[]) {
        int high = Integer.MIN_VALUE;
        for (int i = 0; i < b.length; i++) {
            if (b[i] > high) {
                high = b[i];
            }
        }
        return high;
    }

    public static boolean canMake(int bd[], int days, int m, int k) {
        boolean ans = false;
        int consu = 0;
        for (int i = 0; i < bd.length; i++) {
            if (bd[i] <= days) {
                consu++;
            } else {
                if (consu >= k) {
                    m -= consu / k;
                    if (m <= 0) {
                        return true;
                    }
                }
                consu = 0;
            }
        }
        if (consu >= k) {
            m -= consu / k;
        }
        if (m <= 0) {
            ans = true;
        }
        return ans;
    }

    public static void main(String args[]) {
        int bloomDay[] = { 1, 100, 1, 100, 1, 100 };
        int m = 2;
        int k = 1;
        int ans = -1;
        if ((long) m * k > bloomDay.length) {
            System.out.println(ans);
        } else {
            int low = findLow(bloomDay);
            int high = findHigh(bloomDay);
            while (low <= high) {
                int mid = low + (high - low) / 2;
                boolean canMakeOrNo = canMake(bloomDay, mid, m, k);
                if (canMakeOrNo == true) {
                    ans = mid;
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            System.out.println(ans);
        }
    }
}