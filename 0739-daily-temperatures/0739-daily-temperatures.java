class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

     Stack<int[]> stack = new Stack<>();
     int[] result = new int[temperatures.length];

     for(int i=temperatures.length-1;i>=0;i--){
      
      while(!stack.isEmpty() && stack.peek()[0] <= temperatures[i])
       stack.pop();

      if(stack.isEmpty()){
       result[i] = 0;
      }
      else{
       result[i] = Math.abs(i-stack.peek()[1]);
      }

      stack.push(new int[]{temperatures[i],i}); 
     }  

     return result; 
    }
}