class Solution {
    public int minimumDifference(int[] nums, int k) {
        int n = nums.length;
        int minDiff = Integer.MAX_VALUE;
        List<Integer> current = new ArrayList<>();
        minDiff = dfs(nums, k, 0, current, minDiff);
        return minDiff;
    }
    
    private int dfs(int[] nums, int k, int index, List<Integer> current, int minDiff) {
        if (current.size() == k) {
            int maxVal = Integer.MIN_VALUE;
            int minVal = Integer.MAX_VALUE;
            for (int idx : current) {
                maxVal = Math.max(maxVal, nums[idx]);
                minVal = Math.min(minVal, nums[idx]);
            }
            minDiff = Math.min(minDiff, maxVal - minVal);
            return minDiff;
        }
        for (int i = index; i < nums.length; i++) {
            current.add(i);
            minDiff = dfs(nums, k, i + 1, current, minDiff);
            current.remove(current.size() - 1);
        }
        return minDiff;
    }
}