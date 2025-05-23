class Solution {

    public int BinarySearch(int[] nums){
     
     int start = 0;
     int end = nums.length-1;
     int ans = Integer.MAX_VALUE;

     while(start<=end){

      int mid = start+(end-start)/2;
     
      if(nums[mid] >= nums[start]){
        ans = Math.min(nums[start],ans);
        start = mid+1;
      }
      else{
        ans = Math.min(nums[mid],ans);
        end = mid-1;
      } 
     }

     return ans; 
    }

    public int findMin(int[] nums) {

     return BinarySearch(nums);
    
    }
}