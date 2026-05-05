class Solution {
    public int searchInsert(int[] nums, int target){
        //  0 1 2 3 4 5
        // [-1,0,2,4,6,8]
        int l=0,h=nums.length-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(nums[mid] == target){
                    return mid;
            }
            if(nums[mid]<target){
                l=mid+1;
            }else{
                h=mid-1;
            }
        }
        return l;

        
    }
}