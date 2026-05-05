class Solution {
    public int maxProfit(int[] prices) {
        int s=0;
        int sum=0;
        for(int e=1;e<prices.length;e++){
            if(prices[s]<prices[e]){
                int val=prices[e]-prices[s];
                sum=Math.max(sum,val);
            }else{
                s=e;
            }
        }
        return sum;
    }
}
