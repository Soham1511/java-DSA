class smallestStable {
    public static int findStableIndex(int[] nums, int k) {

        int n = nums.length;

        int[] suffixMin = new int[n];

        suffixMin[n - 1] = nums[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            suffixMin[i] = Math.min(nums[i], suffixMin[i + 1]);
        }

        int prefixMax = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {

            prefixMax = Math.max(prefixMax, nums[i]);

            int score = prefixMax - suffixMin[i];

            if (score <= k) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 1};
        int k = 1;

        System.out.println(findStableIndex(nums, k));
    }
}