class Solution {
    public int lengthOfLastWord(String s) {
       int l=s.length()-1;
       int c=0;
         if(l<=1){
            return 1;
         }
        while (l >= 0 && s.charAt(l) == ' ') {
            l--;
        }
       while(l>0 && s.charAt(l)!=' '){
            l--;
            c++;
       }
       return c;
    }
}