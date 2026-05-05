class Solution {
    public int lengthOfLongestSubstring(String s) {
	 int l=0;
	  int r=0;
	  int sum=0;
	  HashMap<Character,Integer> hashmap=new HashMap<>();
	  for(r=0;r<s.length();r++){
	      if(hashmap.containsKey(s.charAt(r))){
	          l=Math.max(l,hashmap.get(s.charAt(r))+1);
	      }
	      hashmap.put(s.charAt(r),r);
	      sum=Math.max(sum,r-l+1);
	      
	  }
      return sum;
    }
}
