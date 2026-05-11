class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest = nums[0] + nums[1] + nums[2]; // start with first triplet

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (Math.abs(sum - target) < Math.abs(closest - target)) {
                    closest = sum;
                }

                if (sum < target) {
                    left++;       // sum too small, need bigger
                } else if (sum > target) {
                    right--;      // sum too big, need smaller
                } else {
                    return sum;   // exact match, can't do better
                }
            }
        }

        return closest;
    }

    // Time: O(nÂ²) â outer loop Ã two-pointer pass
}