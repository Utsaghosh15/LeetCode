class Solution {
    public int totalSteps(int[] nums) {

     Stack<int[]> stack = new Stack<>();
     int result = 0;
     int n = nums.length-1;
     stack.push(new int[]{nums[n],0});

     for(int i=n-1;i>=0;i--){

      int curr_pass = 0;  
      
      while(!stack.isEmpty() && nums[i] > stack.peek()[0]){
        curr_pass= Math.max(curr_pass+1,stack.peek()[1]);
        stack.pop();
      }
      
      result = Math.max(curr_pass,result);
      stack.push(new int[]{nums[i],curr_pass}); 
     }
    
     return result;
    }
}