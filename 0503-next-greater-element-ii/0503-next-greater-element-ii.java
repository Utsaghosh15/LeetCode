class Solution {
    public int[] nextGreaterElements(int[] nums) {

     Stack<Integer> stack = new Stack<>();
     int[] result = new int[nums.length];

     for(int i=(2*nums.length)-1;i>=0;i--){

      if(i<nums.length){
       
       while(!stack.isEmpty() && nums[i] >= stack.peek())
        stack.pop();

       if(stack.isEmpty()){
        result[i] = -1;
       } 
       else{
        result[i] = stack.peek();
       }

       stack.push(nums[i]);
      } 
      else{

        while(!stack.isEmpty() && nums[i%nums.length] >= stack.peek())
          stack.pop();

        stack.push(nums[i%nums.length]);  
      } 
     }


     return result;    
    }
}