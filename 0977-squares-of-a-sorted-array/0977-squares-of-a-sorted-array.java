class Solution {
    public int[] sortedSquares(int[] nums) {

      int[] result = new int[nums.length];
      int start = 0;
      int end = nums.length-1;
      int result_pointer = nums.length-1;

      while(start <= end){
       
       if(Math.abs(nums[start]) > Math.abs(nums[end])){
        result[result_pointer] = nums[start]*nums[start];
        start+=1;
       }
       else{
        result[result_pointer] = nums[end]*nums[end];
        end-=1;
       }

       result_pointer-=1;
      }
        
      return result;  
    }
}