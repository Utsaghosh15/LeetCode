class Solution {
    public int longestOnes(int[] nums, int k) {

     int start = 0;
     int end = 0;
     int zero = 0;
     int maxlen = 0;

     while(end < nums.length){

        

      if(nums[end] == 0){
        zero+=1;
        end+=1;
      }
      else{
        end+=1; 
      }

      while(zero > k){

        if(nums[start] == 0) 
           zero-=1;

        start+=1;    
      }

      maxlen = Math.max(maxlen,end-start+1);
     }

     return maxlen-1;   
    }   
}