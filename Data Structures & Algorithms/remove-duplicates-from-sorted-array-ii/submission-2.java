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
            int i=Math.min(2,c);
            while(i>0){
                nums[l]=nums[r];
                l++;
                i--;
            }
            
            r++;
        }
        return l;
    }
}