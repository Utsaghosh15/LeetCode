class Solution {
    public int longestOnes(int[] nums, int k) {

     int start = 0;
     int end = 0;
     int current_k = 0;
     int result = 0;

     while(end < nums.length){

      if(nums[end] == 0){

       current_k+=1;

        while(current_k > k){

         if(nums[start] == 0)
          current_k-=1;

         start+=1;    
        }
       
      }

      result = Math.max(result,end-start+1);
      end+=1;  
     }

     return result;   
    }
}