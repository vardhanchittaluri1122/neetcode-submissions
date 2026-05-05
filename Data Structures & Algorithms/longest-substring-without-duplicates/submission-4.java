class Solution {
    public int lengthOfLongestSubstring(String s) {
	 int l=0;
	  int r=0;
	  int sum=0;
	  HashMap<Character,Integer> hashmap=new HashMap<>();
	  for(r=0;r<s.length();r++){
          char sailu=s.charAt(r);
	      if(hashmap.containsKey(sailu)){
	          l=Math.max(l,hashmap.get(sailu)+1);
	      }
	      hashmap.put(sailu,r);
	      sum=Math.max(sum,r-l+1);
	      
	  }
      return sum;
    }
}
//left = Math.max(left, hashMap.get(currentChar) + 1);
