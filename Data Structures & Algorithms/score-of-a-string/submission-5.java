class Solution {
    public int scoreOfString(String str) {
        int e=0;
        int sum=0;
        while(e<str.length()-1){
             int a=str.charAt(e);
             int b=str.charAt(e+1);
             sum=sum + Math.abs(a-b);
            //  s++;
             e++;
        }
        return sum;
    }
}