class Solution {

    public int numSubarray(int[] nums,int goal){

     if(goal < 0) 
      return 0;

     int current_sum = 0;
     int start = 0;
     int end = 0;
     int result = 0;

     while(end < nums.length){

      current_sum+=nums[end];

      while(current_sum > goal){

       current_sum-=nums[start];
       start+=1; 
      }
      
      result+=(end-start+1);
      end+=1;  
     }

     return result;
    }

    public int numSubarraysWithSum(int[] nums, int goal) {

     return numSubarray(nums,goal) - numSubarray(nums,goal-1);
    }
}