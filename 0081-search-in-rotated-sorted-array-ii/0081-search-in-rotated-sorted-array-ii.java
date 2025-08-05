class Solution {

    public boolean BinarySearch(int[] nums,int low,int high,int target){


     if(low > high)
      return false;

     int mid = low + (high-low)/2; 

     if(nums[mid] == target){
      return true;
     }

     if(nums[low] == nums[mid] && nums[high] == nums[mid]){
       return BinarySearch(nums,low+1,high-1,target);
     }
     else if(nums[low] <= nums[mid]){

      if(target >= nums[low] && target < nums[mid])  
        return BinarySearch(nums,low,mid-1,target);
      else
        return BinarySearch(nums,mid+1,high,target);
         
     }
     else{

      if(target > nums[mid] && target <= nums[high])  
        return BinarySearch(nums,mid+1,high,target);
      else
        return BinarySearch(nums,low,mid-1,target);

     }    
    }

    public boolean search(int[] nums, int target) {

     return BinarySearch(nums,0,nums.length-1,target);
    }
}