class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int s=0;
        int r=k-1;
        int min=Integer.MAX_VALUE;
        while(r<nums.length){
            min=Math.min(min,nums[r]-nums[s]);
            r++;
            s++;
        }
        return min;
    }
}