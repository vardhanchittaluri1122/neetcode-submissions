class Solution {
    public void reverseString(char[] s) {
       int i=0,n=s.length-1;
       while(i < s.length && n >= 0){
        //swap
            if(i <= n){
                char temp=s[i];
                s[i]=s[n];
                s[n]=temp;
            }
         n--;
         i++;
       }
    }
}