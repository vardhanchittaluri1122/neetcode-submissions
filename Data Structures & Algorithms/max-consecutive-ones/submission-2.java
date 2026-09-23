class Solution {

    public int findMaxConsecutiveOnes(int[] nums) {

        int max = 0, l = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 1) {
                max = Math.max(max, i - l);
                l = i + 1;
            }

            // Last element is 1
            if (i == nums.length - 1 && nums[i] == 1) {
                max = Math.max(max, i - l + 1);
            }
        }

        return max;
    }
}