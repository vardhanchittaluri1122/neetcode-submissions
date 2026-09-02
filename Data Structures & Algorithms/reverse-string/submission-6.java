class Solution {
    public void reverseString(char[] s) {
       int i=0,n=s.length-1;
       while(i<=n && i < s.length && n >= 0){
            char temp=s[i];
            s[i++]=s[n];
            s[n--]=temp;
       }
    }
}