public class minSpeedReq {
    public static int findSum(int d[]) {
        int sum = 0;
        for (int i = 0; i < d.length; i++) {
            sum += d[i];
        }
        return sum;
    }

    public static void main(String args[]) {
        int dist[] = { 1, 3, 2 };
        double hours = 2.7;
        int low = 1;
        int high = findSum(dist);
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            double totalHrs = 0.0;
            for (int i = 0; i < dist.length; i++) {
                if (i != dist.length - 1) {
                    totalHrs += Math.ceil((double) dist[i] / mid);
                } else {
                    totalHrs += (double) dist[i] / mid;
                }
            }
            if (totalHrs <= hours) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        System.out.println(ans);
    }
}
