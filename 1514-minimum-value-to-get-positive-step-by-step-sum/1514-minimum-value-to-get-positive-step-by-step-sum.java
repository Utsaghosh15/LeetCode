class Solution {
    public int minStartValue(int[] nums) {

     int sum = 0, minSum = 0;

     for(int x : nums){
       sum+=x;
       minSum = Math.min(minSum,sum); 
     }   

     return 1 - minSum;
    }
}