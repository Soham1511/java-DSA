class allocateMinPages {
    public static int findHigh(int a[]) {
        int high = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > high) {
                high = a[i];
            }
        }
        return high;
    }

    public static int findSum(int a[]) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }

    public static boolean canPossible(int a[], int k, int mid) {
        int students = 1;
        int currSum = 0;

        for (int i = 0; i < a.length; i++) {

            if (currSum + a[i] <= mid) {
                currSum += a[i];
            } else {
                students++;
                currSum = a[i];
            }
        }

        return students <= k;
    }

    public static void main(String[] args) {
        int arr[] = { 12, 34, 67, 90 };
        int k = 2;
        int ans = Integer.MAX_VALUE;
        if (arr.length < k) {
            System.out.println(-1);
        } else {
            int low = findHigh(arr);
            int high = findSum(arr);
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if(canPossible(arr, k, mid)){
                    ans = mid;
                    high = mid - 1;
                }
                else{
                    low = mid + 1;
                }
            }
            System.out.println(ans);
        }
    }
}