class Solution {
    public int scoreOfString(String str) {
        int s=0;
        int e=1;
        int sum=0;
        while(e<=str.length()-1){
             int a=str.charAt(s);
             int b=str.charAt(e);
             sum=sum + Math.abs(a-b);
             s++;
             e++;
        }
        return sum;
    }
}