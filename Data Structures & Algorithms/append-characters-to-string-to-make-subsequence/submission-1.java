class Solution {
    public  int appendCharacters(String s, String t) {
	      //coaching                coding 
	      
	      int l=0,r=0;
	         int res=0;
	         while(l<s.length() && r<t.length()){
	             if(s.charAt(l)==t.charAt(r)){
	                 r++;
	             }
	             else{
	                    res=t.length()-r;
	                 
	             }
	             l++;
	         }
             if(r<t.length()){
                res=t.length()-r;
             }
	         if(r==t.length()){
	             return 0;
	         }else{
	             return res;
	         }
	          
	}
	          
}
