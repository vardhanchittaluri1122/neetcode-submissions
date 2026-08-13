class Solution {
    //dp instalization
    static int[] dp1=new int[100];
    static int[] dp2=new int[100];
    public int rob(int[] nums) {
       Arrays.fill(dp1,-1);
       Arrays.fill(dp2,-1);
       if(nums.length==1){
          return nums[0];
       }
       int x=fun(nums,0,true,dp1); 
       int y=fun(nums,1,false,dp2);
       return Math.max(x,y); 
    }
    public static int fun(int[] nums,int i,boolean bt,int[] dp){
        if(i>=nums.length-1 && bt==true){
            return 0;
        }
        if(i>=nums.length && bt==false){
            return 0;
        }
        if(dp[i] != -1){
            return dp[i];
        }
        int x=nums[i]+fun(nums,i+2,bt,dp);
        int y=fun(nums,i+1,bt,dp);
        dp[i]=Math.max(x,y);
        return dp[i];
    }

}
