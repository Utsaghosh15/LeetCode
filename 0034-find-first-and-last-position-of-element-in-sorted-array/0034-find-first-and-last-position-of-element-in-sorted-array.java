class Solution {
    public int FirstPosition(int[] nums,int target){

     int start = 0;
     int end = nums.length-1;
     int result = -1;

     while(start<=end){

      int mid = start+(end-start)/2;

      if(nums[mid] == target)
        result = mid;

      
      if(nums[mid] >= target){
        end = mid-1;
      }   
      else{
        start = mid+1;
      }
     } 

     return result;  
    }

    public int LastPosition(int[] nums,int target){

     int start = 0;
     int end = nums.length-1;
     int result = -1;

     while(start<=end){

      int mid = start+(end-start)/2;

      if(nums[mid] == target)
        result = mid;

      if(nums[mid] > target){
        end = mid-1;
      }   
      else{
        start = mid+1;
      }
     } 

     return result;  
    }

    public int[] searchRange(int[] nums, int target) {
      
      int[] result = {-1,-1};

      result[0] = FirstPosition(nums,target);
      result[1] = LastPosition(nums,target);

      return result;
    }
}