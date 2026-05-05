class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int l=0,r=0;
        int sum=0;
        int flag=0;
        int st=0;
        while(r<nums.length){
            if(nums[r]==0){
                if(flag==0){
                    st=r;
                    flag=1;
                }else{
                    l=st+1;
                    flag=0;
                }
            }
            sum=Math.max(sum,r-l+1);
            r++;
        }
        return sum;
    }
}
