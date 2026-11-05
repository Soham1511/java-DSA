import java.util.Arrays;

class MinSwaps {

    // Calculate sum of digits
    static int digitSum(int n) {
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {

        int[] nums = {18, 43, 34, 16};
        int n = nums.length;

        // Store original array as Integer[] for custom sorting
        Integer[] target = new Integer[n];

        for (int i = 0; i < n; i++) {
            target[i] = nums[i];
        }

        // Sort by digit sum, then by number
        Arrays.sort(target, (a, b) -> {
            int sumA = digitSum(a);
            int sumB = digitSum(b);

            if (sumA != sumB) {
                return Integer.compare(sumA, sumB);
            }

            return Integer.compare(a, b);
        });

        System.out.println("Original: " + Arrays.toString(nums));
        System.out.println("Sorted:   " + Arrays.toString(target));

        // Cycle detection
        boolean[] visited = new boolean[n];
        int swaps = 0;

        for (int i = 0; i < n; i++) {

            if (visited[i] || nums[i] == target[i]) {
                continue;
            }

            int cycleLength = 0;
            int j = i;

            while (!visited[j]) {
                visited[j] = true;
                cycleLength++;

                // Find the target index of nums[j]
                int next = -1;

                for (int k = 0; k < n; k++) {
                    if (target[k] == nums[j]) {
                        next = k;
                        break;
                    }
                }

                j = next;
            }

            swaps += cycleLength - 1;
        }

        System.out.println("Minimum swaps: " + swaps);
    }
}