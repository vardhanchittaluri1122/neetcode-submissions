public class Solution {
    public int searchInsert(int[] nums, int target) {
        int max=0;
        if(nums[0]==0 && target==0  || target ==1 || target < nums[0]){
            return 0;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]<target){
                max=Math.max(max,i);
            }
        }
        return max+1;
    }
}