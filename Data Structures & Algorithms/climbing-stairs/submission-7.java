class Solution {
    public int climbStairs(int n) {
        int[] dp=new int[n+1];
        for(int i=0;i<dp.length;i++){
            dp[i]=-1;
        }
        return fun(dp,n);
    }
    public int fun(int[] dp,int n){
        if(n==1 || n==0){
            return 1;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        dp[n]=fun(dp,n-1)+fun(dp,n-2);
        return dp[n];
    }
}
