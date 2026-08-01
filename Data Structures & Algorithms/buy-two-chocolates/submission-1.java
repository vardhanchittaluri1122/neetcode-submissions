class Solution {
    public int buyChoco(int[] prices, int money) {
       //6 5 4 1 2 9  --->10
       //7

    int f=Integer.MAX_VALUE,n=prices.length,secound=0;
    for(int i=0;i<n;i++){
        if(prices[i]<f){
            secound=f;
            f=prices[i];
        } else if(secound>prices[i]){
            secound=prices[i];
        }
    }
    int sum=f+secound;
    int ans =money -sum;
    if(ans >=0){
        return ans; 
    }else{
        return money;
    }
    



    }
}