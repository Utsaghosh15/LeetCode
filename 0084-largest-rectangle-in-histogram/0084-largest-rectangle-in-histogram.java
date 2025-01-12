class Solution {
    public int largestRectangleArea(int[] heights) {
      
      Stack<Integer> stack = new Stack<>();  
      int result = 0;

      for(int i=0;i<heights.length;i++){

        while(!stack.isEmpty() && heights[stack.peek()] > heights[i]){

         int nse = i;
         int element = heights[stack.pop()];
         int pse = stack.isEmpty() ? -1 : stack.peek();

         result = Math.max(result,element*(nse-pse-1));   
        }
        stack.push(i);
      }

      while(!stack.isEmpty()){

        int nse = heights.length;
        int element = heights[stack.pop()];
        int pse = stack.isEmpty() ? -1 : stack.peek();

        result = Math.max(result,element*(nse-pse-1));   
      }

     return result; 
    }
}