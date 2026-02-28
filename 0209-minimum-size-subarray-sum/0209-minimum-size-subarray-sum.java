class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int l = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;

        for (int r = 0; r < n; r++) {   // fixed i -> r
            sum = sum + nums[r];

            while (sum >= target) {
                int currLength = r - l + 1;
                minLength = Math.min(minLength, currLength);  // fixed minimum -> Math.min
                sum = sum - nums[l];
                l = l + 1;
            }
        }

        if (minLength == Integer.MAX_VALUE) {   // fixed MAX_VALUE
            return 0;
        } else {
            return minLength;
        }
    }
}