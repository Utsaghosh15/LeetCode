class Solution {

 public void swap(int[] nums,int indexOne,int indexTwo){

  int temp = nums[indexOne];
  nums[indexOne] = nums[indexTwo];
  nums[indexTwo] = temp;

  return;
 }

 public void sortColors(int[] nums) {
  

  int low = 0;
  int mid = 0;
  int high = nums.length-1;

  while(mid <= high){

    if(nums[mid] == 0){
      swap(nums,mid,low);
      low+=1;
      mid+=1;  
    }
    else if(nums[mid] == 1){
      mid+=1;  
    }
    else{
      swap(nums,mid,high);
      high-=1;  
    }
  }
 }
}