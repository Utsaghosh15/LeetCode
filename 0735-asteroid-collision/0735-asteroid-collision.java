class Solution {
    public int[] asteroidCollision(int[] asteroids) {

     Stack<Integer> stack = new Stack<>();

     for(int i=0;i<asteroids.length;i++){

      if(asteroids[i] > 0){
       stack.push(asteroids[i]); 
      }
      else{

       while(!stack.isEmpty() && stack.peek() > 0 && stack.peek() < Math.abs(asteroids[i]))
        stack.pop(); 
    
       if(stack.isEmpty() || stack.peek() < 0)
         stack.push(asteroids[i]);

       if(!stack.isEmpty() && stack.peek() == Math.abs(asteroids[i]))
         stack.pop();    
      }
     }

     int[] result_arr = new int[stack.size()];

     for(int i=result_arr.length-1;i>=0;i--)
       result_arr[i] = stack.pop();

     return result_arr;     
    }
}