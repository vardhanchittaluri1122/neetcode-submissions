class Solution {
    static int[] dp=new int[100];
    public int rob(int[] nums) {
        // int l=0,r=1;
        // int result=Integer.MIN_VALUE,sum1=0,sum2=0;
        // while(l<nums.length ){
        //     sum1+=nums[l];
        //     l=l+2;   
        // }
        // while( r<nums.length){
        //     sum2+=nums[r];
        //     r=r+2;
        // }
        // result=Math.max(sum1,sum2);
        // return result;
        Arrays.fill(dp,-1);
        return fun(nums,0);
    }
    public static int fun(int[] arr,int i){
        if(i>=arr.length){
            return 0;
        }
        if(dp[i] != -1){
            return dp[i];
        }
        int sum=arr[i]+fun(arr,i+2);
        int sum2=fun(arr,i+1);
        dp[i]= Math.max(sum,sum2);
        return dp[i];
        
    }
}
