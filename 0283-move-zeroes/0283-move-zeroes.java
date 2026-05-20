class Solution {
    public void moveZeroes(int[] nums) {

     int zero = 0;
     int start = 0;
     int getNumber = 0;

     for(int number: nums){
      if(number == 0)
       zero+=1;  
     }

     
     while(getNumber < nums.length){

      if(nums[getNumber] != 0){
        nums[start] = nums[getNumber]; 
        start+=1;
      }

      getNumber+=1;
     }

     while(start < nums.length){
      nums[start] = 0;   
      start+=1;
     }
    }
}