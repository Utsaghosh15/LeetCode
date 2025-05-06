class Solution {
    public int maxSubArray(int[] nums) {

     long currentSum = 0;
     long resultSum = Long.MIN_VALUE;

     for(int i=0;i<nums.length;i++){

          currentSum += nums[i];

            if (currentSum > resultSum) {
                resultSum = currentSum;
            }

            // If sum < 0: discard the sum calculated
            if (currentSum < 0) {
                currentSum = 0;
            }
     }

     return (int) resultSum;   
    }
}