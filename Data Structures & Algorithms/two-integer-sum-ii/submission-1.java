class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l=0,r=numbers.length-1,sum=0;
        int[] ans=new int[2];
        ans[0]=-1;
        while(l<r){
            sum=numbers[l]+numbers[r];
            if(sum==target){
              ans[0]=l+1;
              ans[1]=r+1;
              return ans;
            }else if(sum<target){
                l++;
            }else{
                r--;
            }
        }
        return ans;
    }
}
