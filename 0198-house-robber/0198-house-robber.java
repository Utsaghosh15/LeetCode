class Solution {

    public int HouseRob(int index, int freeWill, int[] nums, int[][] dp){

      if(index < 0)
       return 0;

      if(dp[index][freeWill] != -1)
        return dp[index][freeWill];

      if(freeWill == 0)
        return dp[index][freeWill] = HouseRob(index-1,1,nums,dp);

      int amount1 = HouseRob(index-1,0,nums,dp) + nums[index];
      int amount2 = HouseRob(index-1,1,nums,dp);

      return dp[index][freeWill] = Math.max(amount1,amount2);    
    }

    public int rob(int[] nums) {

     int[][] dp = new int[nums.length][2]; 

     for(int[] dp_freeWill : dp)
       Arrays.fill(dp_freeWill, -1);
   
     return HouseRob(nums.length-1,1,nums,dp);   
    }
}