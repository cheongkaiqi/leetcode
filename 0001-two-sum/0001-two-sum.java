class Solution {
    public int[] twoSum(int[] nums, int target) {
        int current = 0;
        int max = nums.length;
        boolean foundSolution = false;
        int[] solution = new int[2];
        
        while (!foundSolution && current < max) {
            for (int i = 0; i < nums.length; i++) {
                if ((nums[current] + nums[i] == target) && current != i) {
                    foundSolution = true;
                    solution[0] = current;
                    solution[1] = i;
                }
            }
            current++;
        }
        return solution;
    }
}