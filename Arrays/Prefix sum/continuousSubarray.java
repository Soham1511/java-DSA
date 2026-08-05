class continuousSubarray {
    public static void main(String[] args) {
        int arr[] = {23, 2, 6, 6, 7};
        int k = 6;
        System.out.println(checkSubarraySum(arr, k));
    }

    private static boolean checkSubarraySum(int[] nums, int k) {
        if (nums == null || nums.length < 2) {
            return false;
        }

        for (int start = 0; start < nums.length - 1; start++) {
            int sum = nums[start];
            for (int end = start + 1; end < nums.length; end++) {
                sum += nums[end];
                if (k == 0) {
                    if (sum == 0) {
                        return true;
                    }
                } else {
                    if (sum % k == 0) {
                        return true;
                    }
                }
            }
        }

        return false;
    }
}