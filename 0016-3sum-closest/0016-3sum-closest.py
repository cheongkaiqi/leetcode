class Solution(object):
    def threeSumClosest(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        nums.sort()                        # step 1: sort the array
        closest = float('inf')             # track best sum found so far

        for i in range(len(nums) - 2):     # fix one number at index i
            left = i + 1                   # pointer starting after i
            right = len(nums) - 1          # pointer starting at the end

            while left < right:            # shrink window until pointers meet
                current_sum = nums[i] + nums[left] + nums[right]

                # is this sum closer to target than our best so far?
                if abs(current_sum - target) < abs(closest - target):
                    closest = current_sum

                if current_sum < target:   # sum too small
                    left += 1              #   â move left pointer right
                elif current_sum > target: # sum too big
                    right -= 1             #   â move right pointer left
                else:                      # exact match!
                    return current_sum     #   â can't do better, return

        return closest
        