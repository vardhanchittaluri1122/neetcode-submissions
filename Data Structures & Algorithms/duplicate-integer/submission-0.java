class Solution {
    public boolean hasDuplicate(int[] nums) {
      HashMap<Integer,Integer> map=new HashMap<>();
      boolean flag=false;
      for(int i=0;i<nums.length;i++){
        if(map.containsKey(nums[i])){
            flag=true;
            break;
        }
        map.put(nums[i],i);
      } 
      if(flag==false){
        return false;
      } 
      return true;
    }
}