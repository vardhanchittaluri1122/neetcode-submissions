class Solution {
    public int minimumRecolors(String blocks, int k) {
        int c=0;
        int s=0;
        int sum=k;
        int e=0;
        while(e<blocks.length()){
            if(blocks.charAt(e)=='W'){
                c++;
            }
            if(e-s+1==k){
                sum=Math.min(sum,c);
                if(blocks.charAt(s)=='W'){
                     c--;
                }
                s++;
            }
            e++;
        }
        System.out.println(c);
        return sum;
        
    }
}