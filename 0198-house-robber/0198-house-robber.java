class Solution {

    public int HouseRob(int index, int[] nums, int[] dp){

      if(index < 0)
       return 0;

      if(index == 0)
        return nums[index];

      if(dp[index] != -1)
        return dp[index];

      int amount1 = HouseRob(index-2,nums,dp) + nums[index];
      int amount2 = HouseRob(index-1,nums,dp);

      return dp[index] = Math.max(amount1,amount2);    
    }

    public int rob(int[] nums) {

     int[] dp = new int[nums.length]; 
     Arrays.fill(dp, -1);
   
     return HouseRob(nums.length-1,nums,dp);   
    }
}