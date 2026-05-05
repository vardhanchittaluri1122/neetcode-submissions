class Solution {
    public int maxProfit(int[] prices) {
        int s=0,e=1,sum=0;
     // moving pointer is e
        while(e<prices.length){
            if(prices[s]<prices[e]){
                sum =Math.max(sum,prices[e]-prices[s]);
            }else{
                s=e;
            }
            e++;
        } 
        return sum;  
    }
}
