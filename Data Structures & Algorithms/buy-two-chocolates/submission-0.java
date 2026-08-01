class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int f=prices[0];
        int l=prices[1];
        int sum =f+l;
        int moneyy=money;
        moneyy -= sum;
        if(moneyy >=0){
            return moneyy;
        }else{
            return money;
        }

    }
}