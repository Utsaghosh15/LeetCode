class Solution {

    public int BinarySearch(int[] nums,int low,int high,int target){

     if(low > high)
      return low; 

     int mid = low + (high-low)/2;

     if(nums[mid] == target)
      return mid;
     else if(nums[mid] > target)
      return BinarySearch(nums,low,mid-1,target);
     else 
      return BinarySearch(nums,mid+1,high,target);
           
    }

    public int searchInsert(int[] nums, int target) {

     return BinarySearch(nums,0,nums.length-1,target);    
    }
}