class Solution {
    public int minSubArrayLen(int target, int[] nums) {

     int low = 0;
     int high = 0;
     int result = Integer.MAX_VALUE;
     int current_sum = 0;
     
     while(high < nums.length){ 

      current_sum+=nums[high];

      while(current_sum >= target){
        result = Math.min(result,high-low+1);
        current_sum-=nums[low];
        low+=1;
      }

      high+=1;
     }

     return result == Integer.MAX_VALUE ? 0 : result;  
    }
}