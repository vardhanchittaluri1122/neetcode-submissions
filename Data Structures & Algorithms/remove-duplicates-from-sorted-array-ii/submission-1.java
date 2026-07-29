class Solution {
    public int removeDuplicates(int[] nums) {
        //1,1,1,1,2,2,2,2,3,3
        int l=0,r=0;
        while(r<nums.length){
            int c=1;
            while(r+1<nums.length && nums[r]==nums[r+1]){
                c++;
                r++;
            }
            for(int i=0;i<Math.min(2,c);i++){
                nums[l]=nums[r];
                l++;
            }
            r++;
        }
        return l;
    }
}