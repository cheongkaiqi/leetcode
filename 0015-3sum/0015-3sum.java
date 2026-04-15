class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        // 1. Sort the array
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicates for the 'i' pointer
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    // Triplet found!
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // Skip duplicates for the 'left' pointer
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    // Skip duplicates for the 'right' pointer
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }

                    // Move both pointers inward after finding a valid triplet
                    left++;
                    right--;
                } else if (sum < 0) {
                    // Sum is too small, move left pointer right to increase sum
                    left++;
                } else {
                    // Sum is too large, move right pointer left to decrease sum
                    right--;
                }
            }
        }

        return result;
    }
}