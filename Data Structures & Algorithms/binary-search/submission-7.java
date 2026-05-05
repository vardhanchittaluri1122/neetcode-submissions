class Solution {
    public int search(int[] nums, int target) {
        int s=0;
        int e=nums.length;
        int min=Integer.MIN_VALUE;
        while(e>s){
            int mid=(s+e)/2;
            if(target == nums[mid]){
                return mid;
            }
            if(target>nums[mid]){
                s++;
            }else{
                e--;
            }
        }
        return -1;

    }
}
