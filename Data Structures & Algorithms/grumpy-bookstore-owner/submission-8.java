class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
      int sum1=0,sum2=0;
      int s=0;
      int max=Integer.MIN_VALUE;
      for(int i=0;i<customers.length;i++){
          if(grumpy[i]==1){
            sum1+=customers[i];
          }else{
            sum2+=customers[i];
          }
          if(i-s==minutes){
            if(grumpy[s]==1){
                sum1-=customers[s];
            }
            s++;
          }
        max=Math.max(max,sum1);
      }
      return sum2+max;
    }
}