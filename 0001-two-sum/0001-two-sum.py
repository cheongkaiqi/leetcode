class Solution(object):
    def twoSum(self, nums, target):
        # {} creates an empty dictionary. 
        # A dictionary stores key-value pairs
        # kind of like a real dictionary maps words to definitions.
        seen = {}

        # The i, num part is called unpacking, enumerate returns a pair (index, value)
        for i, num in enumerate(nums):
            complement = target - num

            if complement in seen:
                return [seen[complement], i]

            seen[num] = i
        