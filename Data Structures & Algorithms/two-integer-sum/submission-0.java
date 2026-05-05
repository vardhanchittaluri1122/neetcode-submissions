class Solution {
    public int[] twoSum(int[] nums, int target) {
      HashMap<Integer,Integer> hash=new HashMap<>();
      int a[]=new int[2];
      int sum=0;
        for(int i=0;i<nums.length;i++){
          
          int val=target-nums[i];
          if(hash.containsKey(val)){
             a[0]=hash.get(val);
             a[1]=i;
          }else{
            hash.put(nums[i],i);
          }
        }
        return a;
    }
}
