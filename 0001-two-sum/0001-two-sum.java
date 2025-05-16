class Solution {
    public int[] twoSum(int[] nums, int target) {
     HashMap<Integer,Integer> set = new HashMap<>();
     int[] ans = new int[2];

     for(int i=0;i<nums.length;i++){

      if(set.containsKey(target-nums[i])){
       ans[0] = i;
       ans[1] = set.get(target-nums[i]); 
      }
      else{
        set.put(nums[i],i);
      }
     }

     return ans;   
    }
}