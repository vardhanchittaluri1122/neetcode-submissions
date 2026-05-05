class Solution {
    public boolean isPalindrome(String s) {
        String s1=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        char[] check=s1.toCharArray();
        int st=0,e=s1.length()-1;
        while(st <= e){
            if(check[st] !=  check[e]){
                return false;
            }
            st++;
            e--;
        }
        
        return true;
    }
}
