class Solution {
    public int removeDuplicates(int[] nums) {

     if(nums.length == 0)
      return 0;   

     int result = 0;
     int start = 0;
     int modify = 1;

     while(start < nums.length){

      while((start+1 < nums.length) && nums[start] == nums[start+1]){
       start+=1;
       continue;
      }

      if(start+1 < nums.length) 
       nums[modify] = nums[start+1];
      
      modify+=1;
      result+=1; 
      start+=1;  
     }
     
     return result;  
    }
}