class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int e=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        while(e<nums.length){
            if(map.containsKey(nums[e])){
                int val=map.get(nums[e]);
                if(e-val <= k){
                    return true;
                }
            }
            map.put(nums[e],e);
            e++;
            
        }
        return false;
    }
}