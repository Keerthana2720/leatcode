import java.util.Arrays;

class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        long result = 0;

        for (int i = 0; i < nums.length; i++) {
            int low = lowerBound(nums, i + 1, lower - nums[i]);
            int high = upperBound(nums, i + 1, upper - nums[i]);
            result += high - low;
        }

        return result;
    }

    // Finds the first index >= target starting from 'start'
    private int lowerBound(int[] nums, int start, int target) {
        int low = start, high = nums.length;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

    // Finds the first index > target starting from 'start'
    private int upperBound(int[] nums, int start, int target) {
        int low = start, high = nums.length;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] <= target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
}
