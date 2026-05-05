class Solution {
    public void reverseString(char[] s) {
        char[] sol=new char[s.length];
        int start=0;
        for(int end=s.length-1;end >= 0;end--){
            sol[start]=s[end];
            start++;
        }
        int i=0;
        while(i<s.length){
            s[i]=sol[i];
            i++;
        }
    }
}